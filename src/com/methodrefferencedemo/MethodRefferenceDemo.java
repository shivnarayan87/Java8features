package com.methodrefferencedemo;

public class MethodRefferenceDemo {
	public static void m1() {
		for(int i=0;i<10;i++) {
			System.out.println("Child1-thread");
		}
	}
	
	public static void main(String[] args) {
//		Runnable r=()->{
//			for(int i=0;i<10;i++) {
//				System.out.println("Child-thread");
//			}
//		};
		
		Runnable r= MethodRefferenceDemo :: m1;
		Thread t= new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main1-thread");
			
		}
	}

}
