package technology.learning.and.tracking.application.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "admin")

public class AdminEntity {
	

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int admin_id;
	
	@Column
	private String email;
	
	@NotBlank(message = "password is mandatory")
//	@Size(min = 3, max = 20, message = "password must be between 3 and 20   characters long.")
//    @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "password must be alphanumeric with no spaces")
	@Column
	private String password;

	
	
	public AdminEntity() {
		super();
	}



	public AdminEntity(String email, @NotBlank(message = "password is mandatory") String password) {
		super();
		this.email = email;
		this.password = password;
	}



	public AdminEntity(int admin_id, String email, @NotBlank(message = "password is mandatory") String password) {
		super();
		this.admin_id = admin_id;
		this.email = email;
		this.password = password;
	}



	public int getAdmin_id() {
		return admin_id;
	}



	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "AdminEntity [admin_id=" + admin_id + ", email=" + email + ", password=" + password + "]";
	}
	
		
	
	
		
}
