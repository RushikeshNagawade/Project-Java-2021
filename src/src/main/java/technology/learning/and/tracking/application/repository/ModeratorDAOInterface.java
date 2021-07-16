package technology.learning.and.tracking.application.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import technology.learning.and.tracking.application.model.ModeratorEntity;

@Repository
public interface ModeratorDAOInterface extends JpaRepository <ModeratorEntity,Long> {
	

	public abstract List<ModeratorEntity> findModeratorByMemail(String memail);

	public abstract List<ModeratorEntity> findModeratorByMid(int mid);
}