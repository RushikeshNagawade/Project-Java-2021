package technology.learning.and.tracking.application.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import technology.learning.and.tracking.application.model.TraineeEntity;
import technology.learning.and.tracking.application.service.TraineeServiceInterface;

@RestController
public class TraineeController {

	private static final Logger LOG = LoggerFactory.getLogger(TraineeController.class);

	@Autowired
	private TraineeServiceInterface ui;
	
	@PostMapping("/usercreate")
	public TraineeEntity createProfile(@RequestBody TraineeEntity us) {
		//String str="Registration Fail";
		//AdminEntity i=ai.createProfileService(us);
		//if(i!=null) {
			//str="Registration Success";
		//}
		//return str;
		return ui.userRegisterService(us);
	}
	
	@GetMapping("/userlogin/{temail}/{tpassword}")
	public List<TraineeEntity> userLogin(@PathVariable("temail") String temail, @PathVariable("tpassword") String tpassword) {
		
		return ui.userLoginService(temail, tpassword);
	}
	
	
//	@GetMapping("/searchuser/{user_id}")
//	public UserEntity userSearch(@PathVariable("user_id") int user_id) {
//	
//		return ui.searchUserService(user_id);
//	}
	
	@PutMapping("/updateuser")
	public TraineeEntity updateUser(@RequestBody TraineeEntity us) {
		LOG.info("updateuser");
		return ui.userUpdateService(us);
	}
	
	@Transactional
	@DeleteMapping("deleteuser/{temail}")
	public String deleteEmp(@PathVariable("temail") String temail) {
		LOG.info("delete Trainee");
		return ui.deleteTrainee(temail);
	}
	
}