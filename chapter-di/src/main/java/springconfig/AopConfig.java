package springconfig;

import concert.Audience;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"concert"})
@EnableAspectJAutoProxy
public class AopConfig {

    /*@Bean
    public Audience audience() {
        return new Audience();
    }*/
}
