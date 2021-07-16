package technology.learning.and.tracking.application.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import technology.learning.and.tracking.application.model.TraineeEntity;
import technology.learning.and.tracking.application.repository.TraineeDAOInterface;

@Service
public class TraineeService implements TraineeServiceInterface{

	private static final Logger LOG = LoggerFactory.getLogger(TraineeService.class);
	
	 @Autowired
		private TraineeDAOInterface ui;
		
	    public boolean isLoggedIn = false;
	    
	    @Override
		public TraineeEntity userRegisterService(TraineeEntity us) {
				return ui.save(us);
			}
	
	  @Override
			public List<TraineeEntity> userLoginService(String temail, String tpassword) {
			                
			               if(temail.equals(temail)&& tpassword.equals(tpassword))
			            	   LOG.info("Success");          
			              else
			            	 LOG.info("Sorry the user no exist in DB");   
			         return ui.findTraineeByTemail(temail);
			}
	  
	  
	  @Override
	  public TraineeEntity userUpdateService(TraineeEntity us) {
			LOG.info("updateUser");
			return ui.save(us);
		}
	  
	  
//	@Override
//	public UserEntity searchUserService(int user_id) {
//		         return ui.findById(user_id);
//	}
	  @Override
	  public String deleteTrainee(String temail) {
			LOG.info("deleteTrainee");
			ui.deleteByTemail(temail);
			return temail;
		}

	  
		
}