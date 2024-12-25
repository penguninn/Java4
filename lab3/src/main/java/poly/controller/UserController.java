package poly.controller;

import poly.dao.FavoriteDAO;
import poly.dao.UserDAO;
import poly.daoImp.FavoriteDaoImp;
import poly.daoImp.UserDaoImp;
import poly.entity.Favorite;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    @GetMapping("/hello")
    public String hello(Model model) {
        UserDAO userDAO = new UserDaoImp();
        FavoriteDAO favoriteDAO = new FavoriteDaoImp();
        List<Favorite> favorites = favoriteDAO.findAll();
        favorites.forEach(favorite -> {
            System.out.println(favorite.getVideo().getTitle() + " " + favorite.getUser().getFullname() + " " + favorite.getLikeDate());
        });
        model.addAttribute("favorites", favorites);
        return "index";
    }
}
