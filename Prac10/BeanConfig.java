package Prac10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public HarryPotter getHarry() {
        return new HarryPotter();
    }

    @Bean
    public RonWeasley getRon() {
        return new RonWeasley();
    }

    @Bean
    public Voldemort getVoldemort() {
        return new Voldemort();
    }
}
