package com.vasu.java;

public class TypeCastingTest
{
	public static void main(String[] args)
	{
		/*int x='A';      //compiler  2byte ----> 4 bytes
		
		System.out.println(x);
		
		double d=50;
		System.out.println(d);*/
		
		double d=10.56;    //8 bytes-->4 bytes
		int a=(int)d;
		System.out.println(a);
		int x=65;       //4 bytes---> 2 bytes
		char z=(char)x;
		System.out.println(z);

	}

}
