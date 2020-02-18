package com.social.media.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.social.media.app.model.CommentResourse;
import com.social.media.app.model.Message;
import com.social.media.app.services.MessgeService;

@RestController
@RequestMapping(value = "/message")
public class MessageController {

	@Autowired
	private MessgeService messageService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Message> getAllMessages() {
		return messageService.getAllMessages();
	}

	@RequestMapping(method = RequestMethod.GET, value = ("/{messageId}"))
	public Message getMessageById(@PathVariable Long messageId) {
		return messageService.getMessageById(messageId);
	}

	@RequestMapping(method = RequestMethod.POST)
	public void addMessage(@RequestBody Message message) {
		messageService.addMessage(message);
	}

	@RequestMapping(method = RequestMethod.PUT, value = ("/{messageId}/message"))
	public void editMessasge(@PathVariable Long messageId, @RequestBody Message message) {
		messageService.updateMessage(messageId, message);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = ("{messageId}"))
	public void deleteMessageById(@PathVariable Long messageId) {
		messageService.deleteMessageById(messageId);
	}

	@RequestMapping(value = ("/{messageId}/comment"))
	public CommentResourse getComment() {
		return new CommentResourse();
	}
}
