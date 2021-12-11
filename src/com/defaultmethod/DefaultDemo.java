package com.defaultmethod;

//multiple inheritance with respect to interface.
interface Left{
	default void m1() {
		System.out.println("Left m1 method");
	}
}

interface Right{
	default void m1() {
		System.out.println("right m1 method");
	}
}

public class DefaultDemo implements Left,Right{
	
	public void m1() {
		
		//System.out.println("ovveriding default method");
		Left.super.m1();
		
		
	}
	public static void main(String[] args) {
		DefaultDemo demo= new DefaultDemo();
		demo.m1();
		
	}

}
