package com.predifenedfuncionalinterface;

import java.util.function.Predicate;

//use predicate interface to find length of strings.
public class PredicateDemo {
	public static void main(String[] args) {
		
		String [] array= {"shivnarayan","ishant","priyakumari","sunny"	};
		
		Predicate<String> p=(String s)->s.length()>5 ;
		for(String a:array) {
			if(p.test(a)) {
				System.out.println(a);
				
			}
			
		}
		
	
	}
}
