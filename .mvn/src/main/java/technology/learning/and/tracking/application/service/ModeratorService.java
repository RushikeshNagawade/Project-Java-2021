package technology.learning.and.tracking.application.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired(required=true);
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import technology.learning.and.tracking.application.model.AdminEntity;
import technology.learning.and.tracking.application.model.ModeratorEntity;
import technology.learning.and.tracking.application.repository.ModeratorDAOInterface;

@Service
public class ModeratorService implements ModeratorServiceInterface {

	private static final Logger LOG = LoggerFactory.getLogger(ModeratorService.class);

	@Autowired
	private ModeratorDAOInterface mi;

	public boolean isLoggedIn = false;

	@Override
	public ModeratorEntity moderatorRegisterService(ModeratorEntity md) {
		return mi.save(md);
	}

//		@Override
//		public boolean adminLoginService(AdministratorEntity ad) {
//
//				if(10 == 10)
//					isLoggedIn = true;
//				return isLoggedIn;
//			}
//	    @Override
//		public List<ModeratorEntity>moderatorLoginService(String memail, String mpassword) {
//		                
//		               if(memail.equals(memail)&& mpassword.equals(mpassword))
//		            	   LOG.info("Success");          
//		              else
//		            	 LOG.info("Sorry the user no exist in DB");   
//		         return mi.findModeratorByMemail(memail);
//		}

	@Override
	public List<ModeratorEntity> findModeratorByMid(int mid) {
		LOG.info("moderator search");
		return mi.findModeratorByMid(mid);
	}

}