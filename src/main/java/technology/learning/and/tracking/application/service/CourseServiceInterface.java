package technology.learning.and.tracking.application.service;

import java.util.List;

import technology.learning.and.tracking.application.model.AdminEntity;
import technology.learning.and.tracking.application.model.CourseEntity;
import technology.learning.and.tracking.application.model.ModeratorEntity;


public interface CourseServiceInterface {

	
public abstract CourseEntity courseRegisterService(CourseEntity cr);


public abstract CourseEntity findCourseByCid(int cid);







}