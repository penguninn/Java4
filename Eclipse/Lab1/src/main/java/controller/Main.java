package controller;
import dao.UserDAO;
import entity.User;
import daoImp.UserDaoImpl;

public class Main {
    public static void main(String[] args) {

    	UserDAO userManager = new UserDaoImpl();
        User user = new User(
                "U006",
                "pass123",
                "DaiPc",
                "mail@efpt.edu.vn",
                false
        );
        userManager.findAll();
        userManager.findById("U002");
        userManager.getUsersByQuery();
        userManager.getUsersByPage(3, 5);
        userManager.create(user);
        userManager.update("002", user);

    }

}
