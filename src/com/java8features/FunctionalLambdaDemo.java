package com.java8features;

//collabarating functional interface and lambda expression concept togather.
interface interf{
	public int sum(int a,int b);
	
}

//class Demo implements interf{
//
//	@Override
//	public int sum(int a, int b) {
//		// TODO Auto-generated method stub
//		return a+b;
//	}
//	
//}

public class FunctionalLambdaDemo {
	public static void main(String[] args) {
		//Demo d= new Demo();
		//System.out.println(d.sum(2, 4));
		// here functional interface provide refference to lambda expression , so that lambda
		// expression can be invoked.
		interf i= (a,b)->{return a+b;};
		System.out.println(i.sum(2, 3));
	}

}
