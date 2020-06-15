package com.home.digital;

import java.util.function.Function;

import lombok.Generated;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class ServiceappApplication {

  @Generated
  public static void main(String[] args) {
    SpringApplication.run(ServiceappApplication.class);
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
    return (String value) -> "hello:" + value.toLowerCase();
  }
}
