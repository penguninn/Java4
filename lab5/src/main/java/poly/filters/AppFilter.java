package poly.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter("/*")
public class AppFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // Setting character encoding for both request and response
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        // Pass the request and response along the filter chain
        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization logic (if any)
    }

    @Override
    public void destroy() {
        // Cleanup logic (if any)
    }
}
