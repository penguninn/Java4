package poly.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users", schema = "polyoe")
public class User {
    @Id
    @Size(max = 50)
    @Column(name = "Id", nullable = false, length = 50)
    private String id;

    @Size(max = 100)
    @NotNull
    @Column(name = "Password", nullable = false, length = 100)
    private String password;

    @Size(max = 100)
    @NotNull
    @Column(name = "Email", nullable = false, length = 100)
    private String email;

    @Size(max = 100)
    @NotNull
    @Column(name = "Fullname", nullable = false, length = 100)
    private String fullname;

    @NotNull
    @Column(name = "Admin", nullable = false)
    private Boolean admin = false;

    @OneToMany(mappedBy = "user")
    private List<Favorite> favorites;

    @OneToMany(mappedBy = "user")
    private List<Share> shares;
}