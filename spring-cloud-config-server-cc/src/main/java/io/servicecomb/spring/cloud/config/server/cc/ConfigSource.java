package io.servicecomb.spring.cloud.config.server.cc;

import java.util.Map;

public interface ConfigSource {
  Map<String, String> properties();
}
