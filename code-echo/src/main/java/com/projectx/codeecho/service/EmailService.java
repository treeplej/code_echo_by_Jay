package com.projectx.codeecho.service;

import com.projectx.codeecho.domain.dto.MailDto;
import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor
public class EmailService {

    private JavaMailSender emailSender;
    public void sendSimpleMessage(MailDto mailDto){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("Code-echo@gmail.com");
        message.setTo(mailDto.getAddress());
        message.setSubject(mailDto.getTitle());
        message.setText(mailDto.getContent());
        emailSender.send(message);
    }

    
}
