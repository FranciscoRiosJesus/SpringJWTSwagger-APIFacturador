package dev.franciscorios.facturador;

import com.programming.techie.springredditclone.config.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@Import(SwaggerConfiguration.class)
public class SpringFacturadorApplication {

    public static void main(String[] args) {
        SpringApplication.run(dev.franciscorios.facturador.SpringFacturadorApplication.class, args);
    }

}