package com.belajar.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
	
	@Autowired
	private KafkaTemplate<Object, Object> template;
	
	@PostMapping(path = "kirim")
	public void kirimPesan() {
		for (int i = 1; i <= 10; i++) {
			this.template.send("pesan-saya", "Ini Pesan ke " + i);
		}
	}
}
