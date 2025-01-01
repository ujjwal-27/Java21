package org.example.javaBased.config;

import org.example.javaBased.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration If we want to configure our application using 'java based configuration', the 'config class' must be wrapped with this annotation.
 * @Bean If we want to create a bean, or declare a class as a bean, this annotation is used.
 */
@Configuration
public class AppConfig {
    /**
     * By default, the method's name is the Bean name.
     * But, a bean can be named manually by parsing the required name through the parameter of @Bean annotation.
     * @return Bean object
     */
    @Bean("imac")
    public Desktop desktop() {
        return new Desktop();
    }
}
