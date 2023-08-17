package br.com.via.consumer.console;

import br.com.via.consumer.config.KafkaConsumerConfig;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

import static br.com.via.consumer.config.KafkaConfig.getProperties;
import static br.com.via.consumer.config.KafkaConsumerConfig.propertiesConsumer;

public class Consumer {

    @Autowired
    KafkaConsumerConfig kafkaConsumerConfig;

    public static void main(String[] args) throws IOException {

        // Teste 1 - Topico com uma unica particao - compras.do.cliente
        var consumer = new KafkaConsumer<String, String>(propertiesConsumer());

        Properties prop = getProperties();
        consumer.subscribe(Collections.singletonList(prop.getProperty("kafka.producer.topic")));

        while (true) {
            var records = consumer.poll(Duration.ofMillis(100));

            for (var record : records) {
                System.out.println("Compra nova: ");
                System.out.println("Key: " + record.key());
                System.out.println("Valor: " + record.value());
                System.out.println("Offset: " + record.offset());
                System.out.println("Partition: " + record.partition());
                System.out.println("-------------------------------------");
            }
        }
    }
}

