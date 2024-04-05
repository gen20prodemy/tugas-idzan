package com.example.gen20javaspringbootpos;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

@SpringBootApplication
@EnableScheduling
public class Gen20JavaSpringbootPosApplication {

	public static void main(String[] args) {
		SpringApplication.run(Gen20JavaSpringbootPosApplication.class, args);
	}



}

