package me.coreit.mb;


import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped

public class Listener implements Serializable{
	private String text;
	private int counter;

	
	public void increment() {
		counter+=2;
	}
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public void ajaxEvent() {
		text.toUpperCase();
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	@PreDestroy
	public void print(){
		System.out.println(this);
	}
	
	public String newPage(){
		return "page";
	}
	
}
