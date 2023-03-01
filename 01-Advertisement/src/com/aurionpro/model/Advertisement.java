package com.aurionpro.model;

public class Advertisement {
	private String message;
	private IDisplayable display;
	public Advertisement(String messege, IDisplayable display) {
		super();
		this.message = messege;
		this.display = display;
	}
	public String getMessege() {
		return message;
	}
	public void setMessege(String messege) {
		this.message = messege;
	}
	public IDisplayable getDisplay() {
		return display;
	}
	public void setDisplay(IDisplayable display) {
		this.display = display;
	}
	
	public void showAdvertisement() {
		display.display(message);
	}
}
