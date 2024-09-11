package com.ericsson.collections;

import java.util.PriorityQueue;

public class QueueEx {

	public static void main(String[] args) {

		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("mahesh");
		queue.add("rajesh");
		queue.add("mahesh");
		queue.add("sandeep");
		queue.add("kumar");
		queue.add("naresh");
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		queue.remove();
		System.out.println(queue);
		System.out.println(queue.peek());
	}

}
