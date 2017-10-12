package com.appster.abdullah.util;

public class Test {
	
	//private String test;

	public void getTest() {
		System.out.println(Thread.currentThread().getName());
	}

	public synchronized void setTest(String test) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " start");
		Thread.sleep(200);
		System.out.println(Thread.currentThread().getName() + " end");
	}

}
