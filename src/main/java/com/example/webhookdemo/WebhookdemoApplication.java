package com.example.webhookdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class WebhookdemoApplication {


	public static void main(String[] args) {

		System.out.println("welcome to webhook");
		SpringApplication.run(WebhookdemoApplication.class, args);
	}

}
