package com.home.digital;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SpringAppTest {

  private final ServiceappApplication functions = new ServiceappApplication();

  @Test
  public void main() {
    ServiceappApplication.main(new String[] {});
    String output = this.functions.lowercase().apply("SATHISH");
    assertThat(output).isEqualTo("hello:sathish");
  }
}
