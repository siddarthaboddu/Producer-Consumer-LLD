package com.example.ProducerConsumer;

import java.util.UUID;

public class Producer {
	private Channel channel;
	int currentId;
	
	Producer(Channel channel){
		this.channel = channel;
		this.currentId = 1;
	}
	
	private void push(Message message) {
		channel.push(message);
	}
	
	public void generateRandomMessages(int count)  {
		for(int i=0;i<count;i++) {
			Message message = new Message(currentId++, UUID.randomUUID().toString().substring(0, 6));
			this.push(message);
			System.out.println(String.format("[producer] => {PUSH : %s}", message));
		}
	}
}
