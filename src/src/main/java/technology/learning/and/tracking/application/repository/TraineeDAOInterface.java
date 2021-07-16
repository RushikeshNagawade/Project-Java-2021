package technology.learning.and.tracking.application.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import technology.learning.and.tracking.application.model.TraineeEntity;

@Repository
public interface TraineeDAOInterface extends JpaRepository <TraineeEntity, Integer> {
	
	public abstract List<TraineeEntity> findTraineeByTemail(String temail);

	public abstract void deleteByTemail(String temail);

	//public abstract Optional<UserEntity> findByName(int user_id);
	
//	public abstract List<UserEntity> findUserByName(String fname);
}