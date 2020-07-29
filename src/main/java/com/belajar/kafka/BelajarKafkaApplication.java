package com.belajar.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class BelajarKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelajarKafkaApplication.class, args);
	}
		
	@KafkaListener(id = "kafka", topics = "pesan-saya")
	public void dltListen(String in) {
		System.out.println("Data yang ditarik : " + in);
	} 

}
