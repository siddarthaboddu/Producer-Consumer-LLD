package com.example.ProducerConsumer;

public class Consumer {
	private Channel channel;
	private String consumerID;
	
	Consumer(String consumerID, Channel channel){
		this.consumerID = consumerID;
		this.channel = channel;
	}
	
	public void run() {
		while(true) {
			Message message = channel.poll();
			if(message != null)
				System.out.println(String.format("[%s] => {POLL : %s}", consumerID, message.toString()));
		}
	}
}
