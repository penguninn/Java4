package servlet;

import java.io.File;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@MultipartConfig
@WebServlet("/upload")
public class Upload extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Part part = req.getPart("photo");
		String name = part.getSubmittedFileName();
		long size = part.getSize();
		String type = part.getContentType();

		String uploadDir = req.getServletContext().getRealPath("/files/");
		File dir = new File(uploadDir);
		if (!dir.exists()) {
			dir.mkdirs(); 
		}

		String filename = uploadDir + name;
		part.write(filename);
		
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("application/json");
		String format = "{\"name\": \"%s\", \"type\": \"%s\", \"size\": %d}";
		String responseData = String.format(format, name, type, size);
		resp.getWriter().print(responseData);
	}

}
