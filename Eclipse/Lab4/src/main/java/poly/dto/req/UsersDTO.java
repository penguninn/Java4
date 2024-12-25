package poly.dto.req;

public class UsersDTO {

    private String id;
    private String password;
    private String email;

    // Constructor không tham số
    public UsersDTO() {
    }

    // Constructor có tham số
    public UsersDTO(String id, String password, String email) {
        this.id = id;
        this.password = password;
        this.email = email;
    }

    // Getter và Setter cho id
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter và Setter cho password
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter và Setter cho email
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
