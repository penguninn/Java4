package poly.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users", schema = "polyoe")
public class User {
    @Id
    @Size(max = 20)
    @Column(name = "Id", nullable = false, length = 20)
    private String id;

    @Size(max = 50)
    @NotNull
    @Column(name = "Password", nullable = false, length = 50)
    private String password;

    @Size(max = 50)
    @NotNull
    @Column(name = "Fullname", nullable = false, length = 50)
    private String fullname;

    @Size(max = 50)
    @NotNull
    @Column(name = "Email", nullable = false, length = 50)
    private String email;

    @NotNull
    @Column(name = "Admin", nullable = false)
    private Boolean admin = false;

}