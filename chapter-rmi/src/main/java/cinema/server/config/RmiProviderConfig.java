package cinema.server.config;

import cinema.FilmService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

@Configuration
@ComponentScan(basePackages = {"cinema.server.provider"})
public class RmiProviderConfig {

    @Bean
    public RmiServiceExporter filmService(FilmService filmService){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setService(filmService);
        exporter.setServiceName("filmService");
        exporter.setServiceInterface(FilmService.class);
        return exporter;
    }
}
