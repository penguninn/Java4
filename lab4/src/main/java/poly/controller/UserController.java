package poly.controller;

import poly.dao.UserDAO;
import poly.dao.VideoDAO;
import poly.daoImp.UserDaoImp;
import poly.daoImp.VideoDaoImp;
import poly.dto.res.VideoDTO;
import poly.entity.Share;
import poly.entity.User;
import poly.entity.Video;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping("/login")
    public String pageLogin() {
        return "login";
    }

    @RequestMapping("/search-video")
    public String pageSearch() {
        return "search-video";
    }

    @GetMapping("/video")
    public String getVideo(Model model) {
        VideoDAO videoDAO = new VideoDaoImp();
        List<Video> videos = videoDAO.findAll();
        List<VideoDTO> videodtos = new ArrayList<>();
        videos.forEach(
                video -> {
                    System.out.println(
                            video.getTitle() + " " +
                                    video.getShares().size() + " " +
                                    video.getShares().stream().min(Comparator.comparing(Share::getShareDate)).map(Share::getShareDate).orElse(null) + " " +
                                    video.getShares().stream().max(Comparator.comparing(Share::getShareDate)).map(Share::getShareDate).orElse(null)
                    );
                    videodtos.add(
                            new VideoDTO(
                                    video.getTitle(),
                                    video.getShares().size(),
                                    video.getShares().stream().min(Comparator.comparing(Share::getShareDate)).map(Share::getShareDate).orElse(null),
                                    video.getShares().stream().max(Comparator.comparing(Share::getShareDate)).map(Share::getShareDate).orElse(null)
                            ));
                }
        );
        model.addAttribute("videodtos", videodtos);
        return "video";
    }

    @PostMapping("/check-login")
    public String login(@RequestParam String idOrEmail, @RequestParam String password, Model model) {
        System.out.println(idOrEmail + " " + password);
        String message = "";
        UserDAO userDAO = new UserDaoImp();
        User user = userDAO.findByIdOrEmail(idOrEmail);
        if(user != null && user.getPassword().equals(password)) {
            message = "Login successful";
        } else {
            message = "Login failed";
        }
        model.addAttribute("message", message);
        return "login";
    }

    @GetMapping("/search")
    public String search(@RequestParam String keyword, Model model) {
        VideoDAO videoDAO = new VideoDaoImp();
        List<Video> videos = videoDAO.findByKeyWordOfTitle(keyword);
        model.addAttribute("videos", videos);
        return "search-video";
    }
}
