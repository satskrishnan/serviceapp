package com.home.digital;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SpringAppTest {

  @Test
  public void main() {
    ServiceappApplication.main(new String[] {});
    assertThat("SATHISH").isEqualTo("SATHISH");
  }
}
