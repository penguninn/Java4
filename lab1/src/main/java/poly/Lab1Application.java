package poly;

import poly.entity.User;
import poly.service.UserManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab1Application {
    public static void main(String[] args) {
        SpringApplication.run(Lab1Application.class, args);

        UserManager userManager = new UserManager();
        User user = new User(
                "U006",
                "pass123",
                "DaiPc",
                "mail@efpt.edu.vn",
                false
        );
        userManager.findAll();
        userManager.findById("U001");
        userManager.getUsersByQuery();
        userManager.getUsersByPage(3, 5);
        userManager.create(user);
    }

}
