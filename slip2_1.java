//********SLIP 2********

//1.Write a java program to read ‘N’ names of your friends, store it into HashSet and display them in ascending order

import java.util.*; 
public class Q1 
{ 
	public static void main(String args[]) 
	{ 

		HashSet<String> set = new HashSet<String>(); 

		set.add("geeks"); 
		set.add("practice"); 
		set.add("contribute"); 
		set.add("ide"); 
		System.out.println("Original HashSet:"+set); 

		List<String> list = new ArrayList<String>(set); 
		Collections.sort(list);  
		System.out.println("HashSet elements "+"in sorted order"+"using List:"+list); 
	} 
} 
