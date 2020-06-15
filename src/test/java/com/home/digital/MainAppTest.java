package com.home.digital;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
public class MainAppTest {

  private final ServiceappApplication functions = new ServiceappApplication();

  @Test
  public void main() {
    ServiceappApplication.main(new String[] {});
    String output = this.functions.lowercase().apply("SATHISH");
    assertThat(output).isEqualTo("hello:sathish");
  }
}
