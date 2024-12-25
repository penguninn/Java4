package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "users")
@Entity
public class User {
    @Id
    @Column(name = "Id", nullable = false, length = 20)
    private String id;

    @Column(name = "Password", nullable = false, length = 50)
    private String password;

    @Column(name = "Fullname", nullable = false, length = 50)
    private String fullname;

    @Column(name = "Email", nullable = false, length = 50)
    private String email;

    @Column(name = "Admin", nullable = false)
    private Boolean admin = false;

	public User() {
		super();
	}


	public User(String id, String password, String fullname, String email, Boolean admin) {
		super();
		this.id = id;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
		this.admin = admin;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}



}