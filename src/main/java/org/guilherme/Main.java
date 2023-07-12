package org.guilherme;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.guilherme.adapter.in.KafkaInput;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

import static org.guilherme.adapter.config.KafkaProducerConfig.properties;
import static org.guilherme.adapter.in.KafkaInput.compras;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        var producer = new KafkaProducer<String, String>(properties());
        var topic = "typeOfMessageTransitsHere";
        for (String message : compras()) {
            var key = UUID.randomUUID().toString();
            var record = new ProducerRecord<String, String>(topic, key, message);
            producer.send(record).get();
        }
        producer.flush();
    }

    public static List<String> messageValue() {
        return List.of(
                "asdasgggggggg",
                "asasdsad",
                "kopkpokpok",
                "aaaaa",
                "fffffffff",
                "jhujuuju",
                "klliolkilkilki",
                "kikikikikik",
                "kikizssdsd",
                "czczczczc",
                "rurururur.rar",
                "oaksdpoaskpdoako.exec"
        );
    }

}