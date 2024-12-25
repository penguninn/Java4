package poly.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users", schema = "polyoe")
public class User {
    @Id
    @Column(name = "Id", nullable = false, length = 50)
    private String id;

    @Column(name = "Password", nullable = false, length = 100)
    private String password;

    @Column(name = "Email", nullable = false, length = 100)
    private String email;

    @Column(name = "Fullname", nullable = false, length = 100)
    private String fullname;

    @Column(name = "Admin", nullable = false)
    private Boolean admin = false;

    @OneToMany(mappedBy = "user")
    private List<Favorite> favorites;

    @OneToMany(mappedBy = "user")
    private List<Share> shares;
}