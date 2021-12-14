	/*

package com.j2ee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.mail.MessagingException;

@SpringBootApplication
public class SpringEmailApplication {
	@Autowired
	private EmailSenderService emailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMain() throws MessagingException {

		emailSenderService.sendMail("antoinemousset1999@gmail.com",
				"This is email body",
				"This is email subject","");

	}

}
	*/