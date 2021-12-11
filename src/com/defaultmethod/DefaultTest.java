package com.defaultmethod;

// inside inteface implement method inside in interface, but should be default
// but inside class it should be public.
interface Interf{
	public void m1();
	public void m2();
	default void m3() {
		System.out.println("this is interface default method");
	}
}

public class DefaultTest implements Interf {

	public void m1() {
		System.out.println("hello m1 fist implementation class");
	}

	public void m2() {
		System.out.println("hello m2 fist implementation class");
	}
	
	public void m3() {
		System.out.println("child class overiding default");
	}
	public static void main(String[] args) {
		DefaultTest t= new DefaultTest();
		t.m1();
		t.m3();
	}
	

}
class Test implements Interf{

	public void m1() {
		
	}

	public void m2() {
		
	}
	
}
class Test100 implements Interf{

	public void m1() {
		
	}

	public void m2() {
		
	}
	
}
