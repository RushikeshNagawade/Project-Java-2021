package technology.learning.and.tracking.application.service;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired(required=true);
import org.springframework.stereotype.Service;

import technology.learning.and.tracking.application.model.AdminEntity;
import technology.learning.and.tracking.application.repository.AdminDAOInterface;
@Service
public class AdminService implements AdminServiceInterface {
	
private static final Logger LOG = LoggerFactory.getLogger(AdminService.class);

    @Autowired
	private AdminDAOInterface ai;
	
    public boolean isLoggedIn = false;
    
    @Override
	public AdminEntity adminRegisterService(AdminEntity ad) {
			return ai.save(ad);
		}
	

	@Override
	public List<AdminEntity> findAdminByEmail(String email) {
		 if(email.equals(email))
      	   LOG.info("Success"); 
         else
      	 LOG.info("Sorry the user no exist in DB");   
   return ai.findAdminByEmail(email);
	}
	

//		@Override
//		public void updateAdminPassword(String newPassword, String oldPassword) {
//			LOG.info("updateAdminPassword");
//			ai.updatePassword(newPassword, oldPassword);
//			
//		}

}