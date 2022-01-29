package com.example.ProducerConsumer;

public class Message {

	private Integer id;
	private String content;
	
	Message(int id, String content){
		this.id = id;
		this.content = content;
	}
	
	public int getId() {
		return id;
	}
	
	public String getContent() {
		return content;
	}
	
	@Override
	public String toString() {
		return String.format("Message: [ id: %d, content: %s]", this.id, this.content);
	}
}
