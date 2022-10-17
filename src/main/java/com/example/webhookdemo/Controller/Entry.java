package com.example.webhookdemo.Controller;

import lombok.Data;

import java.util.List;


@Data
public class Entry {
	
	private int id;
	
	private List<Changes> changes;

}
