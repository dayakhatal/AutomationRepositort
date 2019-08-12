package function;

public class FunctionClass1 {

	int a=10;
	
	public static void main(String[] args) 
	{
		/*daya();		
		sum(10,20);
		sum(20,20);*/
				 
		int add=sum2(10,20);
		String str=daya("Daya","Khatal");
			
		System.out.println(add);
		System.out.println(str);
	}
	
	//function with no retuns type and no arguments
		public static void daya()
		{		 
			System.out.println("Testing");
		}	
		
	//function with return type and 2 arguments	
		public static void sum(int a,int b)	
		{
			System.out.println(a+b);
			////System.out.println("Enter the value of b"+b);
		}

		// function with interger return type and 2 arguments
		
		public static  int sum2(int a,int b)
		
		{
			return a+b;
			
		}
		
		
		public static String daya(String name,String surname)
		{
			 
			return "my name is"+name+""+surname;
		}
		
}
