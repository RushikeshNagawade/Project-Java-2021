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
import technology.learning.and.tracking.application.model.ModeratorEntity;
import technology.learning.and.tracking.application.service.ModeratorServiceInterface;







@RestController
public class ModeratorController {
	
	@Autowired
	private ModeratorServiceInterface mi;
	@PostMapping("/moderatorcreate")
	public ModeratorEntity createProfile(@RequestBody ModeratorEntity md) {
		//String str="Registration Fail";
		//ModeratorEntity i=ai.createProfileService(md);
		//if(i!=null) {
			//str="Registration Success";
		//}
		//return str;
		return mi.moderatorRegisterService(md);
	}
	
//	@GetMapping("/mlogin/{memail}/{mpassword}")
//	public List<ModeratorEntity> moderatorLogin(@PathVariable("memail") String memail, @PathVariable("mpassword") String mpassword) {
//		//String str="Registration Fail";
//		//ModeratorEntity i=ai.createProfileService(md);
//		//if(i!=null) {
//			//str="Registration Success";
//		//}
//		//return str;
//		return mi.moderatorLoginService(memail, mpassword);
//	}
	
	// search moderator my mid
	@GetMapping("/searchmoderator/{mid}")
	public List<ModeratorEntity> searchModeratorByMid(@PathVariable("mid") int mid) {
		return mi.findModeratorByMid(mid);
	}
	
	

}
