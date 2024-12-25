package com.poly.controller;

import com.poly.dao.FavoriteDAO;
import com.poly.dao.UserDAO;
import com.poly.daoImp.FavoriteDaoImp;
import com.poly.daoImp.UserDaoImp;
import com.poly.entity.Favorite;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/hello")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDAO userDAO = new UserDaoImp();
        FavoriteDAO favoriteDAO = new FavoriteDaoImp();
        
        List<Favorite> favorites = favoriteDAO.findAll();
        
        favorites.forEach(favorite -> {
            System.out.println(favorite.getVideo().getTitle() + " " + favorite.getUser().getFullname() + " " + favorite.getLikeDate());
        });
        
        request.setAttribute("favorites", favorites);
        request.getRequestDispatcher("/views/index.jsp").forward(request, response);
    }
}
