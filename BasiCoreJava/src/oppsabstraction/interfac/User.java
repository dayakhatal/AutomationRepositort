package oppsabstraction.interfac;

public class User {

	public static void main(String[] args)
	{
		
		
		RBI bank=null;
		String bankname;
		
		//bankname ="Sbi";
		//bankname ="IDBI";
		bankname ="CityBank";
		
		if(bankname.equals("Sbi"))
		
		{
			bank=new Sbi();
			
		}else if(bankname.equals("IDBI"))
		{
			
			bank=new IDBI();
		}else if(bankname.equals("CityBank"))
		{
			
			bank=new CityBank();
			
		}
		//bank= new IDBI();
		bank.savingaccount();
		bank.currentaccount();
		bank.creditcard();
		bank.debitcard();
		
		
	
	}

}
