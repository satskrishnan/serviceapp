package com.home.digital;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CloudFunctionTest {

  private final ServiceappApplication functions = new ServiceappApplication();

  @Test
  public void testUppercase() {
    String output = this.functions.uppercase().apply("sathish");
    assertThat(output).isEqualTo("SATHISH");
  }

  @Test
  public void testLowercase() {
    String output = this.functions.lowercase().apply("SATHISH");
    assertThat(output).isEqualTo("hello:sathish");
  }
}
