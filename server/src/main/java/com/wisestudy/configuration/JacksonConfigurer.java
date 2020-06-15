package com.wisestudy.configuration;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@Configuration
public class JacksonConfigurer {

    @Bean
    public ObjectMapper objectMapper() {
        return Jackson2ObjectMapperBuilder.json()
                .modules(new JavaTimeModule())
                .propertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE)
                .featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                .featuresToEnable(SerializationFeature.WRAP_ROOT_VALUE)
                .featuresToEnable(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)
                .build();
    }

}
