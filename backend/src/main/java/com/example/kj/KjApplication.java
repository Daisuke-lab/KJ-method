package com.example.kj;

import com.example.kj.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class KjApplication {

	public static void main(String[] args) {
		SpringApplication.run(KjApplication.class, args);
	}

}
