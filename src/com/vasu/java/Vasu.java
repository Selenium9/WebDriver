package com.vasu.java;

public class Vasu
{
	int i=10;//instance variables
	 static int j=20; // static 
public void msg()
{
	
	System.out.println(i);
}
public void show()
{
	int k=30;// local variable
	System.out.println(k);
}

public static void main(String[] args) {
	Vasu v=new Vasu();
	System.out.println(j);
	v.msg();
}

}
