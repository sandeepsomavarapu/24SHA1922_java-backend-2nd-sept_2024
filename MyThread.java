package com.ericsson.threads;

public class MyThread implements Runnable {

	@Override
	public void run() {//running
		for (int i = 0; i < 10; i++) {
			System.out.println("MyThread");
			try {
				Thread.sleep(2000);//waiting 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		MyThread obj = new MyThread();
		Thread thread = new Thread(obj);//new state
		thread.start();//runnable
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}
