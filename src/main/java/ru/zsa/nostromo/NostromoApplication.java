package ru.zsa.nostromo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import ru.zsa.nostromo.config.NostromoConfiguration;

@EnableDiscoveryClient
@SpringBootApplication
@Import(NostromoConfiguration.class)
public class NostromoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NostromoApplication.class, args);
    }

}
