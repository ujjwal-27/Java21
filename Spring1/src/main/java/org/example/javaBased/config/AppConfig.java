package org.example.javaBased.config;

import org.springframework.context.annotation.*;

/**
 * @Configuration If we want to configure our application using 'java based configuration', the 'config class' must be wrapped with this annotation.
 * @ComponentScan This annotation takes 'path of package' as 'parameter' where classes are registered as component.
 */
@Configuration
@ComponentScan("org.example.javaBased")
public class AppConfig {

}
