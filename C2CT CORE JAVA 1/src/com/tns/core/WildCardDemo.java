package com.tns.core;

import java.util.Arrays;
import java.util.List;


public class WildCardDemo {

	public static void main(String[] args) {
List<Integer> list1=Arrays.asList(14,45,78,63,89);
		
		List<Double> list2=Arrays.asList(2.3,5.6,8.9,7.5);
		
		printList(list1);
		
		printList(list2);
		
		
	}
	public static  void printList(List<?> list)
	{
		System.out.println(list);
		

	}

}
