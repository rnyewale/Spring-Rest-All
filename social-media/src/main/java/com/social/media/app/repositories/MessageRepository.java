package com.social.media.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.social.media.app.model.Message;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {

}
