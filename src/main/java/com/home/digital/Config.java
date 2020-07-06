package com.home.digital;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("serviceapp")
public class Config {
  private String welcometext;

  public String getWelcometext() {
    return welcometext;
  }

  public void setWelcometext(String welcometext) {
    this.welcometext = welcometext;
  }

  @Override
  public String toString() {
    return "Config{" + "welcometext='" + welcometext + '\'' + '}';
  }
}
