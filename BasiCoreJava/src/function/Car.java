package function;

 public class Car 

{
	
	int wheels=4;
	String color="Red";
	String model="VDI";
	
	public void specificing()
	{
		System.out.print(color + "" + model + "" + " white VDI car having" + "" + "" + wheels +
				 "" + " wheels");
		
	}
	//Default Constructor
	public Car()
	{
		
		
	}
	//parameterize constructor
	public Car( String colour1,String model1)
	{
		
		color=colour1;
		model=model1;
		
	}
	

}
