package com.example.ProducerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class QueueChannel implements Channel{
	
	private BlockingQueue<Message> queue;
	
	QueueChannel(int channelCapacity){
		this.queue = new ArrayBlockingQueue<>(channelCapacity);
	}
	
	public void push(Message message) {
		try {
			queue.put(message);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public Message poll() {
		try {
			Message message = queue.take();
			return  message;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
