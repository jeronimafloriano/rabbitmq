package com.curso.rabbitmq.consumidor;

import java.util.concurrent.ThreadLocalRandom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class HelloRabbitConsumer {

  private static final Logger LOG = LoggerFactory.getLogger(HelloRabbitConsumer.class);

  @RabbitListener(queues = "${spring.rabbitmq.queue}", concurrency = "3-7")
  public void listen(String message) throws InterruptedException {
    LOG.info("Mensagem Recebida. Thread: {}, Mensagem: {}", Thread.currentThread().getName() , message);
    Thread.sleep(ThreadLocalRandom.current().nextLong(4000));
  }

}
