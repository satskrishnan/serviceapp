package com.home.digital;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CloudFunctionTest {

  @Autowired private ServiceFunctions functions;

  @Autowired private Config config;

  @Test
  public void testUppercase() {
    String output = this.functions.uppercase().apply("sathish");
    assertThat(output).isEqualTo("SATHISH");
  }

  @Test
  public void testLowercase() {
    String output = this.functions.lowercase().apply("SATHISH");
    String welcomeText = this.config.getWelcometext();
    assertThat(output).isEqualTo(welcomeText + ":sathish");
  }
}
