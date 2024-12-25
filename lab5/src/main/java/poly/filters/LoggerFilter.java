package poly.filters;

import poly.entity.User;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Date;

@WebFilter("/admin/*")
public class LoggerFilter implements HttpFilter {

    @Override
    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        User user = (User) request.getSession().getAttribute("user");
        String uri = request.getRequestURI();
        Date time = new Date();
        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        HttpFilter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpFilter.super.doFilter(servletRequest, servletResponse, filterChain);
    }

    @Override
    public void destroy() {
        HttpFilter.super.destroy();
    }
}
