package variablesAndDataTypes;

import function.AccessModifiers;

public class TestAcessModeWithinPackage extends AccessModifiers
{

	public static void main(String[] args) 
	
	{
		AccessModifiers obj2=new AccessModifiers();
		
		obj2.publicfunction();
		
		TestAcessModeWithinPackage obj3= new TestAcessModeWithinPackage();
				
		obj3.protectedfunction();

	}

}
