package com.oocl.test.power_test.controller;

import com.oocl.test.power_test.entity.Message;
import com.oocl.test.power_test.repository.messageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class messageController {
    @Autowired
    private messageRepository messageRepository;

    @GetMapping("/message")
    public Message getMessage(String id){
        return messageRepository.getOne(id);
    }

    @PostMapping("/message")
    public Message poMessge(Message message){
        return messageRepository.save(message);
    }
}
