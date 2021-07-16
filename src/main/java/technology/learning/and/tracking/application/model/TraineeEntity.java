 package technology.learning.and.tracking.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "trainee")
public class TraineeEntity {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tid;
	@Column
	private String fname;
	@Column
	private String lname;
	@Column
	private String temail;
	@NotBlank(message = "password is mandatory")
//	@Size(min = 3, max = 20, message = "password must be between 3 and 20   characters long.")
//    @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "password must be alphanumeric with no spaces")
	private String tpassword;
	
	

	
	public TraineeEntity() {
		super();
	}




	public TraineeEntity(String fname, String lname, String temail,
			@NotBlank(message = "password is mandatory") String tpassword) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.temail = temail;
		this.tpassword = tpassword;
	}




	public TraineeEntity(int tid, String fname, String lname, String temail,
			@NotBlank(message = "password is mandatory") String tpassword) {
		super();
		this.tid = tid;
		this.fname = fname;
		this.lname = lname;
		this.temail = temail;
		this.tpassword = tpassword;
	}




	public int getTid() {
		return tid;
	}




	public void setTid(int tid) {
		this.tid = tid;
	}




	public String getFname() {
		return fname;
	}




	public void setFname(String fname) {
		this.fname = fname;
	}




	public String getLname() {
		return lname;
	}




	public void setLname(String lname) {
		this.lname = lname;
	}




	public String getTemail() {
		return temail;
	}




	public void setTemail(String temail) {
		this.temail = temail;
	}




	public String getTpassword() {
		return tpassword;
	}




	public void setTpassword(String tpassword) {
		this.tpassword = tpassword;
	}




	@Override
	public String toString() {
		return "TraineeEntity [tid=" + tid + ", fname=" + fname + ", lname=" + lname + ", temail="
				+ temail + ", tpassword=" + tpassword + "]";
	}




	

}
	
		

