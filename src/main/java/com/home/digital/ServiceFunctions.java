package com.home.digital;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
@Slf4j
public class ServiceFunctions {

  private final Config config;

  @Autowired
  public ServiceFunctions(Config config) {
    this.config = config;
  }

  /* echo sathish | http :8765/uppercase */
  @Bean
  public Function<String, String> uppercase() {
    log.info("Getting into uppercase function");
    return String::toUpperCase;
  }

  /* echo sathish | http :8765/lowercase */
  @Bean
  public Function<String, String> lowercase() {
    log.info("Getting into uppercase function");
    return (String value) -> config.getWelcometext() + ":" + value.toLowerCase();
  }
}
