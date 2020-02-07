package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Human;

@Service
public class HumanService {
	private Human human;
	
	public HumanService() {
		human = new Human();
	}
	
	public Human getHuman() {
		return human;
	}
	
	public void setHuman(Human human) {
		this.human = human;
	}
}
