package org.guilherme;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.guilherme.model.Customer;

import java.util.concurrent.ExecutionException;

import static org.guilherme.adapter.config.KafkaProducerConfig.properties;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Customer msgProd = new  Customer("10125556289", "Guilherme");

        KafkaProducer<String, Customer> producer = properties();
        var topic = "typeOfMessageTransitsHere";
        producer.send(new ProducerRecord<String, Customer>(topic, "1", msgProd));
        System.out.println("Message sent " + msgProd.getCpf() +"    "+ msgProd.getName());
        producer.close();
//        producer.flush();
    }
}