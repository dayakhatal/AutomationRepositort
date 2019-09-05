package firstassign;


public class First 
{

	public static void main(String[] args) 
	{
	
		First dp =new First();

			String str="java";
			String str2="Making Mistake";
			int x=1000;
			
			System.out.println("We are learning"+""+str+ "Selenium" +""+str2 +"" +x+ "");
			
			dp.even(0);	
	}
	
	public int even(int num)
	
	{
		num=0;
		for(int i=1;num<=100;i++)
		{
			System.out.println(i);
			num =i+1;
		
		}
		return num;
		
		
		
	}
	
	
}
