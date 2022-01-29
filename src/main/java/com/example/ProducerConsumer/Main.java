package com.example.ProducerConsumer;

public class Main {

	public static void main(String[] args) {
		int channelSize = 10;
		Channel queueChannel = new QueueChannel(channelSize);
		Producer producer = new Producer(queueChannel);
		Consumer consumer1 = new Consumer("consumer-1", queueChannel);
		Consumer consumer2 = new Consumer("consumer-2", queueChannel);
		
		new Thread(new Runnable() {
		     @Override
		     public void run() {
		    	 producer.generateRandomMessages(10);
		     }
		}).start();
		new Thread(new Runnable() {
		     @Override
		     public void run() {
		    	 consumer1.run();
		     }
		}).start();
		new Thread(new Runnable() {
		     @Override
		     public void run() {
		    	 consumer2.run();
		     }
		}).start();
		
		
//		producer.generateRandomMessages(10);
//		consumer.run();
	}
}
