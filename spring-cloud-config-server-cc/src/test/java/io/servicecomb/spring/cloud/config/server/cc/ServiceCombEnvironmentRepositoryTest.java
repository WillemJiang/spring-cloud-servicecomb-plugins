package io.servicecomb.spring.cloud.config.server.cc;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.util.Collections;

import org.junit.Test;
import org.springframework.cloud.config.environment.Environment;

public class ServiceCombEnvironmentRepositoryTest {

  private final EmbeddedConfigSource configSource = new EmbeddedConfigSource(Collections.singletonMap("key", "value"));

  private ServiceCombEnvironmentRepository environmentRepository;

  @Test
  public void addsPropertiesToEnvironment() throws Exception {
    environmentRepository = new ServiceCombEnvironmentRepository(configSource);

    Environment environment = environmentRepository.findOne("java chassis", "production", "master");
    Object value = environment.getPropertySources().get(0).getSource().get("key");

    assertThat(value, is("value"));
  }
}