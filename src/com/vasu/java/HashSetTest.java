package com.vasu.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest
{
	public static void main(String[] args)
	{
		Set<String> s=new HashSet<>();
		s.add("Vasu");
		s.add("Selenium");
		s.add("Qtp");
		s.add("ETL");
		s.add("Vasu");
		System.out.println(s.size());
		
		Iterator<String> it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		/*for (String list : s) 
		{
			System.out.println(list);
		}
*/
	}

}
