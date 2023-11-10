package com.projectx.codeecho;

import com.projectx.codeecho.domain.dto.MailDto;
import com.projectx.codeecho.service.EmailService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication
public class CodeEchoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeEchoApplication.class, args);

	}

}


