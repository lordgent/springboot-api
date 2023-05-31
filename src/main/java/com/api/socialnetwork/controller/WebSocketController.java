package com.api.socialnetwork.controller;

import com.api.socialnetwork.model.MessageRequest;
import com.api.socialnetwork.model.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/sendMessage")
    @SendTo("/topic/chat")
    public MessageResponse sendMessage(MessageRequest message) {
        return new MessageResponse(message.getContent());
    }
}
