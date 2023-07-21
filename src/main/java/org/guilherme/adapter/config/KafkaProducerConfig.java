package org.guilherme.adapter.config;


import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.guilherme.model.Customer;

import java.util.Properties;

public class KafkaProducerConfig{

    public static KafkaProducer <String, Customer> properties() {
        var properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:29092");
//        properties.put(ProducerConfig.CLIENT_ID_CONFIG, CONSUMER_APP_ID);
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.guilherme.serializer.CustomSerializer");

        return new KafkaProducer<>(properties);
    }
}
