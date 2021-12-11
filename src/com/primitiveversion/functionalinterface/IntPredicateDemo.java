package com.primitiveversion.functionalinterface;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

//commented line gives performance issue because of atoboxing and autounboxing happen in this case
// to reduce performance issue primitive version of FI availavlble.
public class IntPredicateDemo {
	public static void main(String[] args) {
		int []x= {0,5,10,15,20,25,30};
		//Predicate<Integer> p= i->i%2==0;
		IntPredicate p= i->i%2==0;
		for(int value:x) {
			if(p.test(value)) {
				System.out.println("even no: "+value);
				
			}
			
		}
		
	}

}
