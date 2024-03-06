package com.curso.rabbitmq.produtor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ProdutorApplication {

	private HelloRabbitProducer rabbitProducer;

	public ProdutorApplication(HelloRabbitProducer rabbitProducer) {
		this.rabbitProducer = rabbitProducer;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProdutorApplication.class, args);
	}

}
