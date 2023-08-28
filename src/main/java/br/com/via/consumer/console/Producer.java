package br.com.via.consumer.console;

import br.com.via.consumer.config.KafkaProducerConfig;
import br.com.via.consumer.interfaces.IProducer;
import lombok.AllArgsConstructor;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.retrytopic.DestinationTopic;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

import static br.com.via.consumer.config.KafkaConfig.getProperties;

@Service
@AllArgsConstructor
public class Producer {

    @Autowired
    KafkaProducerConfig kafkaProducerConfig;

    @Autowired
    private static KafkaTemplate<String, Object> kafkaTemplate;

    public static void TesteProducer() {
            kafkaTemplate.send("kafka.producer.topic", "compras: 50 reais");
    }
}
