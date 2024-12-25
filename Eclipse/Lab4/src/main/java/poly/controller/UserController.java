package poly.controller;

import poly.dao.UserDAO;
import poly.dao.VideoDAO;
import poly.daoImp.UserDaoImp;
import poly.daoImp.VideoDaoImp;
import poly.dto.res.VideoDTO;
import poly.entity.Share;
import poly.entity.User;
import poly.entity.Video;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@WebServlet({"/video", "/login", "/search", "/check-login", "/search-video"})
public class UserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getRequestURI();
//        System.out.println(action);
        if (action.contains("login")) {
        	System.out.println(action);
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } else if (action.contains("search-video")) {
            request.getRequestDispatcher("/search-video.jsp").forward(request, response);
        } else if (action.contains("video")) {
            VideoDAO videoDAO = new VideoDaoImp();
            List<Video> videos = videoDAO.findAll();
            List<VideoDTO> videodtos = new ArrayList<>();
            videos.forEach(
                    video -> {
                        videodtos.add(
                                new VideoDTO(
                                        video.getTitle(),
                                        video.getShares().size(),
                                        video.getShares().stream().min(Comparator.comparing(Share::getShareDate)).map(Share::getShareDate).orElse(null),
                                        video.getShares().stream().max(Comparator.comparing(Share::getShareDate)).map(Share::getShareDate).orElse(null)
                                ));
                    }
            );
            request.setAttribute("videodtos", videodtos);
            request.getRequestDispatcher("/video.jsp").forward(request, response);
        }
    }

    // Kiểm tra đăng nhập
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getRequestURI();
        if (action.contains("check-login")) {
            String idOrEmail = request.getParameter("idOrEmail");
            String password = request.getParameter("password");

            String message = "";
            UserDAO userDAO = new UserDaoImp();
            User user = userDAO.findByIdOrEmail(idOrEmail);

            if (user != null && user.getPassword().equals(password)) {
                message = "Login successful";
            } else {
                message = "Login failed";
            }
            request.setAttribute("message", message);
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } else if (action.contains("search")) {
            String keyword = request.getParameter("keyword");
            VideoDAO videoDAO = new VideoDaoImp();
            List<Video> videos = videoDAO.findByKeyWordOfTitle(keyword);
            request.setAttribute("videos", videos);
            request.getRequestDispatcher("/search-video.jsp").forward(request, response);
        }
    }
}
