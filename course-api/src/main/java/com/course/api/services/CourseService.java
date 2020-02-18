package com.course.api.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.api.entity.Course;
import com.course.api.repo.CourseRepositories;

@Service
public class CourseService {

	@Autowired
	private CourseRepositories courseRepository;

	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<Course>();
		courseRepository.findByTopicEntityId(topicId).forEach(courses::add);
		return courses;
	}

	public Course getCourseById(String id) {
		return courseRepository.findById(id).get();
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourseById(String topicId) {
		courseRepository.deleteById(topicId);
	}

}
