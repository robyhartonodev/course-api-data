package io.robyapp.springbootstart.topic.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

// CrudRepository<[EntityName], [EntityIdDataType]>
public interface CourseRepository extends CrudRepository<Course, String> {
	public List<Course> findByTopicId(String topicId); 
	public List<Course> findByName(String name);
}
