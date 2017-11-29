package io.servicecomb.spring.cloud.config.server.cc;

import java.util.Collections;
import java.util.Map;

public class EmbeddedConfigSource implements ConfigSource {
  public EmbeddedConfigSource(Map<String, String> properties) {

  }

  @Override
  public Map<String, String> properties() {
    return Collections.emptyMap();
  }
}
