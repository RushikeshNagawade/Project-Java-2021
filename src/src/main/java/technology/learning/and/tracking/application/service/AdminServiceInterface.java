package technology.learning.and.tracking.application.service;

import java.util.List;

import technology.learning.and.tracking.application.model.AdminEntity;

public interface AdminServiceInterface {

	
	public abstract AdminEntity adminRegisterService(AdminEntity ad);
	
//	public abstract List<AdminEntity> adminLoginService(String email);

	public abstract List<AdminEntity> findAdminByEmail(String email);
	//public abstract List<AdministratorEntity> adminLoginService(AdministratorEntity ad);

//	public abstract List<AdminEntity> adminLoginService(String email);

//	public abstract AdminEntity adminRegisterService(AdminEntity ad);

}