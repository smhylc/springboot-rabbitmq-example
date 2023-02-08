package com.springrabbitmq.springbootrabbitmqexample.controller;

import com.springrabbitmq.springbootrabbitmqexample.model.Notification;
import com.springrabbitmq.springbootrabbitmqexample.producer.NotificationSender;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

/**
 * @author Semih Yolcu
 * Created on 8.02.2023
 */

@RestController
@RequestMapping("/send")
@RequiredArgsConstructor
public class SendNotification {
	private final NotificationSender notificationProducer;

	@PostMapping
	public String send() {
		Notification notification = Notification
				.builder()
				.notificationId(UUID.randomUUID().toString())
				.seen(true)
				.message("SEND TEST DATA")
				.createdAt(new Date())
				.build();
		notificationProducer.addQueue(notification);
		return "Message send";
	}
}
