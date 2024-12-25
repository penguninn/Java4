package poly.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import poly.dao.UserDAO;
import poly.daoImp.UserDaoImp;
import poly.entity.User;
import poly.filters.AuthFilter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		UserDAO dao = new UserDaoImp();
		User user = dao.findByIdOrEmail(username);

		if (user == null) {
			req.setAttribute("message", "Invalid username");
		} else if (!user.getPassword().equals(password)) {
			req.setAttribute("message", "Invalid password");
		} else {
			HttpSession session = req.getSession();
			session.setAttribute("user", user);
			String securityUri = (String) session.getAttribute(AuthFilter.SECURITY_URI);
			if (securityUri != null) {
				resp.sendRedirect(securityUri);
				session.removeAttribute(AuthFilter.SECURITY_URI);
				return;
			}
//            resp.sendRedirect(req.getContextPath() + "/home");
//            return;
		}
		req.getRequestDispatcher("/login.jsp").forward(req, resp);
	}
}
