package com.ericsson.threads;

public class MyThread1 extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		Thread.currentThread().setPriority(9);
		Thread.currentThread().setName("india");
		System.out.println(Thread.currentThread());
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");//thread-1,5
		}
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread.currentThread().setPriority(10);
		Thread.currentThread().setName("ericsson");
		System.out.println(Thread.currentThread());
		MyThread1 obj=new MyThread1();
		obj.start();//run,gc(),main()
		
		MyThread1 obj1=new MyThread1();
		obj1.start();//run,gc(),main()
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");//main,5(1-10)
		}
	}

}
