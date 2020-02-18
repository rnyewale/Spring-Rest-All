package com.course.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.course.api.entity.Course;
import com.course.api.services.CourseService;
import com.rest.api.restcontroller.model.TopicEntity;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	@RequestMapping(method = RequestMethod.GET, value = "/alltopics/{topicId}/courses")
	public List<Course> getAllCourses(@PathVariable String topicId) {
		return courseService.getAllCourses(topicId);
	}

 	@RequestMapping(method = RequestMethod.GET, value = "/topic/{topicId}/course/{id}")
	public Course getCourseById(@PathVariable String topicId) {
		return courseService.getCourseById(topicId);
	}

	@RequestMapping(method = RequestMethod.POST, value = ("/savetopic/{topicId}/course"))
	public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
		course.setTopicEntity(new TopicEntity(topicId, " ", " "));
		courseService.addCourse(course);
	}

	@RequestMapping(method = RequestMethod.PUT, value = ("/updatetopic/{topicId}/course/{id}"))
	public void updateCourse(@PathVariable String topicId, @PathVariable String id, @RequestBody Course course) {
		courseService.updateCourse(course);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = ("/deletetopic/{topicId}/course/{id}"))
	public void deleteCourseById(@PathVariable String topicId) {
		courseService.deleteCourseById(topicId);
	}
 
}
