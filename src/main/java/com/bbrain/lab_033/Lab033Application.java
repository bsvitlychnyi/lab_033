package com.bbrain.lab_033;

import com.bbrain.lab_033.component.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;


@SpringBootApplication
@Slf4j
public class Lab033Application {
	@Autowired
	private Person person;

	public static void main(String[] args) {
		SpringApplication.run(Lab033Application.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void onRun(){
		log.info("System started");
		person.goTaxi();
	}
}
