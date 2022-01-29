package com.example.ProducerConsumer;

public interface Channel {
	
	public void push(Message message);
	public Message poll();
	
}
