package com.curso.rabbitmq.produtor;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class HelloRabbitProducer {

  private RabbitTemplate rabbitTemplate;
  private Queue queue;
  private int i = 0;

  public HelloRabbitProducer(RabbitTemplate rabbitTemplate, Queue queue) {
    this.rabbitTemplate = rabbitTemplate;
    this.queue = queue;
  }

  @Scheduled(fixedRate = 1000)
  public void sendHello() {
    i++;
    rabbitTemplate.convertAndSend(queue.getName(),
        "Hello! " + " - mensagem número: " + i);
  }
}
