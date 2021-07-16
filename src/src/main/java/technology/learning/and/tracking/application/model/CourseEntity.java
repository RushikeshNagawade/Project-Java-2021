package technology.learning.and.tracking.application.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "course")
public class CourseEntity {
	
	@Id
 	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
 	
	@Column
	private String cname;

	@Column
	private double cfee;
	
	
//	@ManyToOne
//	private ModeratorEntity moderatorentity;
//	@JoinColumn(name = "mod_id")

	
	public CourseEntity() {
		super();
	}


	public CourseEntity(int cid, String cname, double cfee) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cfee = cfee;
	}


	public CourseEntity(String cname, double cfee) {
		super();
		this.cname = cname;
		this.cfee = cfee;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public double getCfee() {
		return cfee;
	}


	public void setCfee(double cfee) {
		this.cfee = cfee;
	}


	@Override
	public String toString() {
		return "CourseEntity [cid=" + cid + ", cname=" + cname + ", cfee=" + cfee + "]";
	}
	
	
	
}
