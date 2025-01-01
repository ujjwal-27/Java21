package org.example.javaBased.config;

import org.example.javaBased.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Configuration If we want to configure our application using 'java based configuration', the 'config class' must be wrapped with this annotation.
 * @Bean If we want to create a bean, or declare a class as a bean, this annotation is used.
 */
@Configuration
public class AppConfig {
    /**
     * Bean name:
     * By default, the method's name is the Bean name.
     * But, a bean can be named manually by parsing the required name through the parameter of @Bean annotation.
     * Scope:
     * By default, the scope of a bean is 'singleton'. Meaning, if the bean is invoked twice or more with 'singleton' scope, it will refer to same object in the container.
     * But, a scope of bean can be changed by parsing "prototype" in @Scope annotation.
     * @return Bean object
     */
//    @Bean("imac")
    @Bean()
    @Scope("prototype")
    public Desktop desktop() {
        return new Desktop();
    }
}
