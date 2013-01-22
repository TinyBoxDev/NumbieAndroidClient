package com.tinybox.numbie.models;

public class Game {
	
	private int MAX_ATTEMPTS_NUM = 20;
	private int MAX_CLOSING_TIME = 120;
	
	private String numbieNumber;
	private int attempts;
	private int closingTime;
	
	public Game() {
		this.numbieNumber = "";
		for (int index = 0; index < 3; index++) {
			this.numbieNumber += Integer.toString((int)(Math.random() * 11));
		}
		this.attempts = 0;
		this.closingTime = 0;
	}
	
	public int getAttempts() {
		return this.attempts;
	}
	
	public int getClosingTime() {
		return this.closingTime;
	}

}
