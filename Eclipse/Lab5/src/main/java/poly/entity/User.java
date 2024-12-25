package poly.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
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

    // Constructor không tham số
    public User() {
    }

    // Constructor đầy đủ tham số
    public User(String id, String password, String email, String fullname, Boolean admin, List<Favorite> favorites, List<Share> shares) {
        this.id = id;
        this.password = password;
        this.email = email;
        this.fullname = fullname;
        this.admin = admin;
        this.favorites = favorites;
        this.shares = shares;
    }

    // Getter và Setter cho id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter và Setter cho password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter và Setter cho email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter và Setter cho fullname
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    // Getter và Setter cho admin
    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    // Getter và Setter cho favorites
    public List<Favorite> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Favorite> favorites) {
        this.favorites = favorites;
    }

    // Getter và Setter cho shares
    public List<Share> getShares() {
        return shares;
    }

    public void setShares(List<Share> shares) {
        this.shares = shares;
    }
}
