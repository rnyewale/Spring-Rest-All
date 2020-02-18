package com.social.media.app.model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = ("/"))
public class CommentResourse {

	/*
	 * @RequestMapping(method = RequestMethod.GET, value = ("/comment")) public
	 * String getComment() { return
	 * "Sub resourse Comment called from Message Resourse"; }
	 */

	@RequestMapping(method = RequestMethod.GET, value = ("/{commentId}"))
	public String getCommentById(@PathVariable Long commentId) {
		return "comment of Id: ";
	}
}
