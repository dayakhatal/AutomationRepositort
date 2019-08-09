package function;

public class StaticAndNonStaticFunction2 {


	public  static String name="Daya";
	
	public String surname="Khatal";
	
	public static void fn1()
	
	{
		System.out.println(name);
		
		StaticAndNonStaticFunction2 obj2=new StaticAndNonStaticFunction2();
		System.out.println(obj2.surname);
		
	}
	public void fun()
	{
		
		System.out.println(name);
		
		System.out.println(surname);
		
	}
	
	public static void main(String[] args)
	{
	
	//static variable and function calling from second class by using classname 	
		
		System.out.println(StaticAndNonStatucFunction.name);
		StaticAndNonStatucFunction.fn1();
		
	//non static varibale and function calling from second class
		
		StaticAndNonStatucFunction st2=new StaticAndNonStatucFunction();
		
		System.out.println(st2.surname);
		st2.fun();
		
	}
	
	
}



	


