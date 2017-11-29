package io.servicecomb.spring.cloud.config.server.cc;

import java.util.Map;

import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.config.environment.PropertySource;
import org.springframework.cloud.config.server.environment.EnvironmentRepository;

public class ServiceCombEnvironmentRepository implements EnvironmentRepository {
  private final ConfigSource configSource;

  public ServiceCombEnvironmentRepository(ConfigSource ConfigSource) {

    configSource = ConfigSource;
  }

  @Override
  public Environment findOne(String application, String profile, String label) {
    Map<String, String> properties = configSource.properties();
    PropertySource propertySource = new PropertySource("default", properties);

    return null;
  }
}
