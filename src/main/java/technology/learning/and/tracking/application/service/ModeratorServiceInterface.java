package technology.learning.and.tracking.application.service;

import java.util.List;

import technology.learning.and.tracking.application.model.ModeratorEntity;


public interface ModeratorServiceInterface {

	
    public abstract ModeratorEntity moderatorRegisterService(ModeratorEntity md);
	
//	public abstract List<ModeratorEntity> moderatorLoginService(String memail, String mpassword);

	public abstract List<ModeratorEntity> findModeratorByMid(int mid);

	//public abstract List<Employee> findEmployeeByEname(String ename);
}
