package br.com.via.consumer.console;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class PlatforConsumerKafkaConsoleJavaApplication {
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        System.out.println("Consumer Kafka - Console");

        Producer.TesteProducer();

        //Consumer.main();
    }
}