package com.projectx.codeecho.controller;

import com.projectx.codeecho.domain.dto.MailDto;
import com.projectx.codeecho.service.EmailService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class MailController {
    private final EmailService emailService;

    @GetMapping("/mail")
    public String dispMail(){
        return "mail";
    }

    @PostMapping("/mail")
    public void execMail(MailDto mailDto){
        emailService.sendSimpleMessage(mailDto);
    }


}
