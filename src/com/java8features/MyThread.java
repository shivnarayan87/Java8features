package com.java8features;

//lamda concept with multithreading
public class MyThread {
//	public void run() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("child thread");
//			
//		}
//	}
	
	public static void main(String[] args) {
		
	//	MyThread r= new MyThread();
		
		Runnable la=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("child thread");
				
			}
		};
		//Thread t= new Thread(r);
		Thread t= new Thread(la);
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread.");
			
		}
		
	}

}
