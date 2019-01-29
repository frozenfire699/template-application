package org.megro.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class JacksonConfiguration {

  private static final ObjectMapper mapper = new ObjectMapper();

  @Bean
  @Primary
  public ObjectMapper objectMapper() {
    mapper.registerModule(new Jdk8Module());
    return mapper;
  }
}