package technology.learning.and.tracking.application.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import technology.learning.and.tracking.application.model.AdminEntity;
import technology.learning.and.tracking.application.model.CourseEntity;
import technology.learning.and.tracking.application.model.ModeratorEntity;
import technology.learning.and.tracking.application.service.CourseServiceInterface;
import technology.learning.and.tracking.application.service.TraineeServiceInterface;

@RestController
public class CourseController {

	@Autowired
	private CourseServiceInterface ci;
	
	@PostMapping("/coursecreate")
	public CourseEntity createCourse(@RequestBody CourseEntity md) {
		return ci.courseRegisterService(md);
	}
	
	@GetMapping("/searchcourses/{cid}")
	public CourseEntity searchCourseByid(@PathVariable("cid") int cid) {
		return ci.findCourseByCid(cid);
	}
	
	@GetMapping("/searchcoursebyname/{cname}")
	public List<CourseEntity> searchCourseByCname(@PathVariable("cname") String cname) {
		return ci.findCourseByCname(cname);
	}
	
}
