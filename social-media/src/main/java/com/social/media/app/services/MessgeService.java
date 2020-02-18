package com.social.media.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.social.media.app.model.Message;
import com.social.media.app.repositories.MessageRepository;

@Service
public class MessgeService {

	@Autowired
	private MessageRepository messageRepository;

	public List<Message> getAllMessages() {
		List<Message> messages = new ArrayList<Message>();
		messageRepository.findAll().forEach(messages::add);
		return messages;
	}

	public Message getMessageById(Long messageId) {
		return messageRepository.findById(messageId).get();
	}

	public void addMessage(Message message) {
		messageRepository.save(message);
	}

	public void updateMessage(Long messageId, Message message) {
		messageRepository.save(message);
	}

	public void deleteMessageById(Long messageId) {
		messageRepository.deleteById(messageId);
	}
}
