package cinema.client.config;

import cinema.FilmService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@Configuration
@ComponentScan(basePackages = {"cinema.client.consumer"})
public class RmiConsumerConfig {

    @Bean
    public RmiProxyFactoryBean filmService() {
        RmiProxyFactoryBean factoryBean = new RmiProxyFactoryBean();
        factoryBean.setServiceUrl("rmi://localhost/filmService");
        factoryBean.setServiceInterface(FilmService.class);
        return factoryBean;
    }
}
