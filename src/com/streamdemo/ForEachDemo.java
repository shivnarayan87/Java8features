package com.streamdemo;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEachDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		
		ArrayList<Integer> al1= new ArrayList<Integer>();
		
		al.add(0);
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		
		
		
		al.stream().forEach(i->{System.out.println((i*i));}
				
				);
		
	}

}
