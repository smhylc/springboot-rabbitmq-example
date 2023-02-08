package com.springrabbitmq.springbootrabbitmqexample.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Semih Yolcu
 * Created on 8.02.2023
 */

@Configuration
@RequiredArgsConstructor
@EnableRabbit
public class RabbitConfiguration {

	@Value("${app.rabbitmq.queueName}")
	private String queue;
	@Value("${app.rabbitmq.routingName}")
	private String route;
	@Value("${app.rabbitmq.exchangeName}")
	private String exchange;

	@Bean
	public Queue queueOne() {
		return new Queue(queue);
	}

	@Bean
	public DirectExchange directExchange() {
		return new DirectExchange(exchange, true, false);
	}

	@Bean
	public Binding bindingOne(final Queue queueOne, final DirectExchange directExchange) {
		return BindingBuilder
				.bind(queueOne)
				.to(directExchange)
				.with(route);
	}
}
