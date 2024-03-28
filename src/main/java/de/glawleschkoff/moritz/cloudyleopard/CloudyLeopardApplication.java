package de.glawleschkoff.moritz.cloudyleopard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class CloudyLeopardApplication {

    public static void main(String[] args) {

        SpringApplication.run(CloudyLeopardApplication.class, args);
        System.out.println("111");
    }

}
