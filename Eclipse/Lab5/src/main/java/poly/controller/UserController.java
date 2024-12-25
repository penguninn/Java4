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
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@WebServlet({"/login", "/search-video", "/video", "/check-login", "/search"})
public class UserController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        switch (path) {
            case "/login":
                System.out.println("Login");
                request.getRequestDispatcher("login.jsp").forward(request, response);
                break;
            case "/search-video":
                request.getRequestDispatcher("search-video.jsp").forward(request, response);
                break;
            case "/video":
                getVideo(request, response);
                break;
            case "/search":
                search(request, response);
                break;
            default:
                response.sendError(HttpServletResponse.SC_NOT_FOUND);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath();
        if ("/check-login".equals(path)) {
            String idOrEmail = request.getParameter("idOrEmail");
            String password = request.getParameter("password");

            String message = getString(request, idOrEmail, password);

            request.setAttribute("message", message);
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request, response);
        } else {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }

    private String getString(HttpServletRequest request, String idOrEmail, String password) {
        UserDAO userDAO = new UserDaoImp();
        User user = userDAO.findByIdOrEmail(idOrEmail);

        String message = null;
        if(user == null) {
            message = "Not found id or email";
        }
        if(user != null && !password.equals(user.getPassword())) {
            message = "Wrong password";
        }
        if(message == null) {
            message = "Login Successful";
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
        }
        return message;
    }

    private void getVideo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        VideoDAO videoDAO = new VideoDaoImp();
        List<Video> videos = videoDAO.findAll();
        List<VideoDTO> videodtos = new ArrayList<>();

        videos.forEach(video -> {
            videodtos.add(new VideoDTO(
                    video.getTitle(),
                    video.getShares().size(),
                    video.getShares().stream().min(Comparator.comparing(Share::getShareDate)).map(Share::getShareDate).orElse(null),
                    video.getShares().stream().max(Comparator.comparing(Share::getShareDate)).map(Share::getShareDate).orElse(null)
            ));
        });

        request.setAttribute("videodtos", videodtos);
        RequestDispatcher dispatcher = request.getRequestDispatcher("video.jsp");
        dispatcher.forward(request, response);
    }

    private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String keyword = request.getParameter("keyword");

        VideoDAO videoDAO = new VideoDaoImp();
        List<Video> videos = videoDAO.findByKeyWordOfTitle(keyword);

        request.setAttribute("videos", videos);
        RequestDispatcher dispatcher = request.getRequestDispatcher("search-video.jsp");
        dispatcher.forward(request, response);
    }
}
