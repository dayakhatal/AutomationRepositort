package oop.polymorphism;

public class MethoOverloading {

	public static void main(String[] args) 
	
	{
		
		MethoOverloading met =new MethoOverloading();
		
		met.sum(10,20);
		met.sum(15,25,35);
		
		
	} 

	
	
	public int sum(int a, int b)
	
	{
		return a+b;
	}
	public int sum(int a,int b,int c)
	{
		
		return a+b+c;
		
		
	}
	
}
