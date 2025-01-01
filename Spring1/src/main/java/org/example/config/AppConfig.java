package org.example.config;

import org.example.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration If we want to configure our application using 'java based configuration', the 'config class' must be wrapped with this annotation.
 * @Bean If we want to create a bean, or declare a class as a bean, this annotation is used.
 */
@Configuration
public class AppConfig {
    @Bean
    public Desktop desktop() {
        return new Desktop();
    }
}
