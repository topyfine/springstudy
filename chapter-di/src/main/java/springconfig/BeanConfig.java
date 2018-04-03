package springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import soundsystem.CDPlayer;
import soundsystem.CompactDisc;
import soundsystem.TigerCD;

@Configuration
@ComponentScan(basePackageClasses = {CDPlayer.class})
@PropertySource("classpath:config.properties")
public class BeanConfig {

    // 非自动装配
    /*@Bean
    public CompactDisc TigerCD() {
        return new TigerCD();
    }*/
}
