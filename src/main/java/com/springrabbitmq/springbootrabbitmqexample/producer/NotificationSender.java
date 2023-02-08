package com.springrabbitmq.springbootrabbitmqexample.producer;

import com.springrabbitmq.springbootrabbitmqexample.model.Notification;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Semih Yolcu
 * Created on 8.02.2023
 */

/* The class that will write notifications continuously  */

@Service
@Slf4j
@RequiredArgsConstructor
public class NotificationSender {

	@Value("${app.rabbitmq.routingName}")
	private String routing;

	@Value("${app.rabbitmq.exchangeName}")
	private String exchange;
	private final RabbitTemplate rabbitTemplate;

	public void addQueue(Notification notification) {
		log.info("ID : " + notification.getNotificationId());
		rabbitTemplate.convertAndSend(exchange, routing, notification);
	}

}
