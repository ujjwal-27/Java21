package org.example.javaBased.config;

import org.example.javaBased.Alien;
import org.example.javaBased.Computer;
import org.example.javaBased.Desktop;
import org.example.javaBased.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

/**
 * @Configuration If we want to configure our application using 'java based configuration', the 'config class' must be wrapped with this annotation.
 * @Bean If we want to create a bean, or declare a class as a bean, this annotation is used.
 */
@Configuration
public class AppConfig {
    /**
     * -- Autowire:
     * The 'computer' reference variable in the parameter means that Alien bean is depended on Computer.
     * Spring will ask the container to look for computer object. For now, we have 'desktop' bean which is a computer object since the 'class Desktop implements Computer interface'.
     * Hence, it will parse the desktop object. This phenomenon is known as autowiring.
     * -- Autowiring with two beans of same property:
     * Here, we have two beans: Desktop and Laptop which represents Computer.
     * In this situation, we need to specify which bean to use.
     * There are two ways: using @Primary annotation on Desktop or Laptop bean. Or parsing @Qualifier("bean_name") annotation through alien bean.
     * Using both will prioritize @Qualifier annotation over @Primary.
     * @param computer Computer object
     * @return Alien object
     */
    @Bean
    public Alien alien(@Qualifier("desktop") Computer computer) {
        Alien obj = new Alien();
        obj.setAge(27);
        obj.setComputer(computer);
//        obj.setComputer(desktop()); // This is tightly coupled. Meaning, it would pass desktop in every execution, and won't be able to pass other bean like Laptop.

        return obj;
    }

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
//    @Scope("prototype")
    public Desktop desktop() {
        return new Desktop();
    }

    @Bean
    @Primary
    public Laptop laptop() {
        return new Laptop();
    }
}
