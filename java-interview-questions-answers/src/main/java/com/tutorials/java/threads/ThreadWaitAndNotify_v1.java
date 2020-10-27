package com.tutorials.java.threads;

class Calculator_v1 extends Thread {
	long sum;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 1000000; i++) {
				sum += i;//499999500000
			}
			notify();
		}
	}
	//Who notify to run method in this case, output is coming same here.
	/*
	public void run() {
		///synchronized (this) {
			for (int i = 0; i < 1000000; i++) {
				sum += i;//499999500000
			}
			//notify();
		//}
	}*/
}

public class ThreadWaitAndNotify_v1 {
	public static void main(String[] args) {
		Calculator_v1 thread1 = new Calculator_v1();
		Calculator_v1 thread2 = new Calculator_v1();
		thread2.start();
		thread1.start();
		synchronized (thread1) {
			try {
				thread1.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(thread1.sum);
		System.out.println(thread2.sum);

	}
}
