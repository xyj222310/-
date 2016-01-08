package com.myproject.Model;

public class Label {

	Integer id;
	String handler;
	String operation;
	String	date;
	public Label(Integer id, String handler, String operation, String date) {
		super();
		this.id = id;
		this.handler = handler;
		this.operation = operation;
		this.date = date;
	}
	public long getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getHandler() {
		return handler;
	}
	public void setHandler(String handler) {
		this.handler = handler;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
