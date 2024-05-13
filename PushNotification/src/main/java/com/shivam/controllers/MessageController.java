package com.shivam.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.shivam.models.Message;

@Controller
public class MessageController {
	
	@Autowired
	SimpMessagingTemplate simpMessagingTemplate;
	
	@MessageMapping("/application")
	@SendTo("all/messages")
	public Message send(@RequestBody Message message) throws Exception {
		return message;
	}
	
	public void sendToSpecificUSer(@Payload Message message) {
		simpMessagingTemplate.convertAndSendToUser(message.getTo(), "/specific", message);
	}
	
}
