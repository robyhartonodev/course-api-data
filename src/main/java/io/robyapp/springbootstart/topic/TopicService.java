package io.robyapp.springbootstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	// Get all topics
	public List<Topic> getAllTopics() {
		List<Topic> mTopics = new ArrayList<>();
		topicRepository.findAll().forEach(mTopics::add);
		return mTopics;

	}

	// Get topic with specific id from the list
	public Topic getTopic(String id) {
		return topicRepository.findById(id).get();
	}

	// Add topic to the topic list
	public void addTopic(Topic topic) {
		topicRepository.save(topic); 
	}

	// Update the topic based on id
	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}

	// Delete the topic based on id
	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}
}
