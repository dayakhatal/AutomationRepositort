package arrays;

public class Array2 {

	public static void main(String[] args) 
	
	
	{
		// TODO Auto-generated method stub

		
		String[][] str=new String[3][2];
		
		//row1
		
		str[0][0]="U1";
		str[0][1]="T1";
		
		
		str[1][0]="U2";
		str[1][1]="T2";
		
		str[2][0]="U3";
		str[2][1]="T3";
		
		for(int r=0;r<3;r++)  
		
		{
			for(int j=0;j<2;j++)
			{
				
				System.out.println(str[r][j]);
				
			}
				
				
			
			
		}
	}

}
