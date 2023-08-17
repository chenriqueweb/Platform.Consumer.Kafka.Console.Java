package br.com.via.consumer.console;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class PlatforConsumerKafkaConsoleJavaApplication {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(PlatforConsumerKafkaConsoleJavaApplication.class, args);

        new Consumer();
    }

}
