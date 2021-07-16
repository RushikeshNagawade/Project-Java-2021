package technology.learning.and.tracking.application.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "moderator")
public class ModeratorEntity {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mid;
	@Column(name = "mname")
	private String mname;
	@Column(name = "memail")
	private String memail;
	@NotBlank(message = "password is mandatory")
//	@Size(min = 3, max = 20, message = "password must be between 3 and 20   characters long.")
//	@Pattern(regexp = "^[a-zA-Z0-9]+$", message = "password must be alphanumeric with no spaces")
	@Column(name = "password")
	private String mpassword;


//	@OneToMany(mappedBy = "course_id")
//	private CourseEntity courseEntity;
	
	public ModeratorEntity() {
		super();
	}

	

	public ModeratorEntity(String mname, String memail, @NotBlank(message = "password is mandatory") String mpassword) {
	super();
	this.mname = mname;
	this.memail = memail;
	this.mpassword = mpassword;
}



	public ModeratorEntity(int mid, String mname, String memail,
		@NotBlank(message = "password is mandatory") String mpassword) {
	super();
	this.mid = mid;
	this.mname = mname;
	this.memail = memail;
	this.mpassword = mpassword;
}



	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMemail() {
		return memail;
	}

	public void setMemail(String memail) {
		this.memail = memail;
	}

	public String getMpassword() {
		return mpassword;
	}

	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}



	@Override
	public String toString() {
		return "ModeratorEntity [mid=" + mid + ", mname=" + mname + ", memail=" + memail + ", mpassword=" + mpassword
				+ "]";
	}

	
	
	
}
