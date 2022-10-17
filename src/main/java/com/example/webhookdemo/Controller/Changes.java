package com.example.webhookdemo.Controller;

import lombok.Data;

import java.util.List;

@Data
public class Changes {
	
	private Value value;
	
	private List<Contacts> contacts;
	
	private List<Messages> messages;
	
	private String field;

}
