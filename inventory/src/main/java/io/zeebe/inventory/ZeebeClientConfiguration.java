package io.zeebe.inventory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.zeebe.client.ZeebeClient;

@Configuration
public class ZeebeClientConfiguration {
  
  @Bean
  public ZeebeClient zeebe() {
    ZeebeClient zeebeClient = ZeebeClient.newClientBuilder().brokerContactPoint("192.168.12.138:26500").build();
    return zeebeClient;
  }

}
