package com.example.webhookdemo.Controller;

import lombok.Data;

import java.security.Timestamp;

@Data
public class Messages {
	
	private String from;
	
	private int id;
	
	private Timestamp timestamp;
	
	private Text text;
	
	private String type;

}
