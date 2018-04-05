package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spittr.controller.HomeController;

@Configuration
@ComponentScan(basePackages = {"spittr.controller"})
public class WebConfig {
}
