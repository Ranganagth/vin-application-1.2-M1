package com.example.M1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@Service
public class M1Producer {
public static final String topic = "k1-topic";
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemp;
	
	//This Method Producing Messages to KAFKA
	public void publicToTopic(String message) {
		System.out.println("Publishing to k1-topic "+message);
		this.kafkaTemp.send(topic,message);
	}

}
