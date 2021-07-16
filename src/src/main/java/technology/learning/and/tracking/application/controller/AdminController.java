package technology.learning.and.tracking.application.controller;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.tools.sjavac.Log;

import technology.learning.and.tracking.application.model.AdminEntity;
import technology.learning.and.tracking.application.service.AdminServiceInterface;

@RestController
public class AdminController {

	@Autowired
	private AdminServiceInterface ai;
	@PostMapping("/createadmin")
	public AdminEntity adminRegister(@RequestBody AdminEntity ad) {
		//String str="Registration Fail";
		//AdminEntity i=ai.createProfileService(ad);
		//if(i!=null) {
			//str="Registration Success";
		//}
		//return str;
		return ai.adminRegisterService(ad);
	}
	
	@GetMapping("/searchadmin/{email}")
	public List<AdminEntity> searchAdminByEmail(@PathVariable("email") String email) {
		return ai.findAdminByEmail(email);
	}
	
	
}
