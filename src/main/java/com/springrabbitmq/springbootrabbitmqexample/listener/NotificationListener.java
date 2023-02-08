package com.springrabbitmq.springbootrabbitmqexample.listener;

import com.springrabbitmq.springbootrabbitmqexample.model.Notification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @author Semih Yolcu
 * Created on 8.02.2023
 */

@Service
@Slf4j
public class NotificationListener {

	@RabbitListener(queues = {"${app.rabbitmq.queueName}"})
	public void handle(Notification notification) {
		log.info("Notification : " + notification.getNotificationId());
		log.info(notification.toString());
	}
}
