package com.predifenedfuncionalinterface;

import java.util.function.Predicate;

// check no is even or not and if even should be >10. multiple condition
public class PredicateJoinConcept {
	public static void main(String[] args) {
		
		int[] x= {0,2,4,5,10,18,19};
		Predicate<Integer> p1= i->i%2==0;
		Predicate<Integer> p2= i-> i>10;
		
		for (int j : x) {
			if(p1.and(p2).test(j)) {
				System.out.println(j);
				
			}
			
//			if(p1.or(p2).test(j)) {
//				System.out.println(j);
//			}
			
		}
		
	}

}
