package com.course.api.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.course.api.entity.Course;

public interface CourseRepositories extends CrudRepository<Course, String> {

	public List<Course> findByTopicEntityId(String topicId);

	/*
	 * public List<Course> findByName(String name);
	 * 
	 * public List<Course> findByDescription(String description);
	 * 
	 * public List<Course> findByCourseId(String courseId);
	 */
}
