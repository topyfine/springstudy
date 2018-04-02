package springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import soundsystem.CDPlayer;
import soundsystem.CompactDisc;
import soundsystem.TigerCD;

@Configuration
@ComponentScan(basePackageClasses = {CDPlayer.class})
public class BeanConfig {

    // 非自动装配
    /*@Bean
    public CompactDisc TigerCD() {
        return new TigerCD();
    }*/
}
