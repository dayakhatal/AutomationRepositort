package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class SetInterface {

	public static void main(String[] args)
	{
	
		/*
		//Hashset print randomly
		
     Set<String> set=new HashSet<>();	
     set.add("Pooja");
     set.add("Akshay");
     set.add("Daya");
     set.add("Gauri");
     set.add("Gauri");
		
		for(String d:set)
		{
			
			System.out.println(d);
			
		}
*/
		/*
		//Hashset print as per given/declaration order
		
	     Set<String> set=new LinkedHashSet<>();	
	     set.add("Pooja");
	     set.add("Akshay");
	     set.add("Daya");
	     set.add("Gauri");
	     set.add("Gauri");
			
			for(String d:set)
			{
				
				System.out.println(d);
				
			}
		
		*/
		
		
		//Treeset print alphabetically
			 Set<String> set=new TreeSet<>();	
		     set.add("Pooja");
		     set.add("Akshay");
		     set.add("Daya");
		     set.add("Gauri");
		     set.add("Gauri");
				
				for(String d:set)
				{
					
					System.out.println(d);
					
				}
		
	}

}
