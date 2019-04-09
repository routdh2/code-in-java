package org.dhananjay.programming;
//Threads can be created by two ways. 
//1. By extending Thread class
//2. by implementing Runnable interface

//once extends Thread, it can't extend any other class
class MultiThreading extends Thread {
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " is running.");
		}
		catch(Exception e) {
			System.out.println("Exception occured.");
		}
		
	}
}

class MultiThreading2 implements Runnable {
	public void run() {
		try {
			System.out.println(Thread.currentThread().getId() + " is running.");
		}
		catch(Exception e) {
			System.out.println("Exception occured.");
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MultiThreading object = new MultiThreading();
//		object.start();
		Thread object = new Thread(new MultiThreading2());
		object.start();

	}

}
