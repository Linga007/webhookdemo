package com.example.webhookdemo.Controller;

import lombok.Data;

import java.util.List;

@Data
public class TextMsg {

	private String object;
	
	private List<Entry> entry;
}
