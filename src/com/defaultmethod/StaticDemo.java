package com.defaultmethod;

//java 1.8 version contain static method also inside interface.
//only by interface name we can invoke method else not any alternative method.
interface Interf1{
	public static void m1() {
		System.out.println("static method");
	}
}
public class StaticDemo {
	public static void main(String[] args) {
		Interf1.m1();
	}

}
