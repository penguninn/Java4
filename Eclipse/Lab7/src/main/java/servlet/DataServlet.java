package servlet;
import java.io.IOException;

import org.json.JSONObject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/data")
public class DataServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        JSONObject jsonResponse = new JSONObject();
        jsonResponse.put("manv", "TeoNV");
        jsonResponse.put("hoTen", "Nguyễn Văn Tèo");
        jsonResponse.put("gioiTinh", true);
        jsonResponse.put("luong", 950.5);


        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        response.getWriter().write(jsonResponse.toString());
    }
}
