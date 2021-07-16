package technology.learning.and.tracking.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import technology.learning.and.tracking.application.model.AdminEntity;

@Repository
public interface AdminDAOInterface extends JpaRepository <AdminEntity, Long> {
	//Optional<AdministratorEntity> findByEmail(String email);
	
	public abstract List<AdminEntity> findAdminByEmail(String email);

	
}