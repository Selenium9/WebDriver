package com.vasu.java;

public class Sample 
{
	//variables
	int k=20;
	//methods
	public void add()
	{
		int a=20;
		int b=30;
		int sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) 
	{
		//object
		Sample v=new Sample();
		v.add();
		System.out.println(v.k);
	}

}
