package io.robyapp.springbootstart.topic;

import org.springframework.data.repository.CrudRepository;

// CrudRepository<[EntityName], [EntityIdDataType]>
public interface TopicRepository extends CrudRepository<Topic, String> {

}
