package io.robyapp.springbootstart.topic.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository topicRepository;

	// Get all topics
	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		topicRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;

	}

	// Get topic with specific id from the list
	public Course getCourse(String id) {
		return topicRepository.findById(id).get();
	}

	// Add topic to the topic list
	public void addCourse(Course course) {
		topicRepository.save(course);
	}

	// Update the topic based on id
	public void updateCourse(Course course) {
		topicRepository.save(course);
	}

	// Delete the topic based on id
	public void deleteCourse(String id) {
		topicRepository.deleteById(id);
	}
}
