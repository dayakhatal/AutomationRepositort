package function;

public class AccessModifiers 
{
	
	public static void main(String[] args) 
	{
		AccessModifiers obj=new AccessModifiers();
		
		obj.publicfunction();
		
	}
	
	
	public void publicfunction()
	{
		
		System.out.println("public function");
		
		
	}
	
	private void privatefunction()
	
	{
		
		System.out.println("private");
		
	}
	
	
    protected void protectedfunction()
	
	{
		
		System.out.println("protected");
		
	}
	
       void defaulytfunction()

      {
	
	     System.out.println("Default");
	
   }


}
