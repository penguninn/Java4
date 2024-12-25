package poly.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.*;
import poly.entity.User;

import java.io.IOException;

@WebFilter({ "/admin/*", "/account/change-password", "/account/edit-profile", "/video/like/*", "/video/share/*" })
public class AuthFilter implements Filter {
	public static final String SECURITY_URI = "securityUri";

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		HttpSession session = req.getSession(false);
		User user = (session != null) ? (User) session.getAttribute("user") : null;
		String uri = req.getRequestURI();
		if (user == null) {
			session = req.getSession(true);
			session.setAttribute(SECURITY_URI, uri);
			resp.sendRedirect(req.getContextPath() + "/login");
		} else if (uri.contains("/admin/") && !user.getAdmin()) {
			resp.sendError(HttpServletResponse.SC_FORBIDDEN, "Access Denied");
		} else {
			chain.doFilter(request, response);
		}
	}

	@Override
	public void destroy() {

	}
}
