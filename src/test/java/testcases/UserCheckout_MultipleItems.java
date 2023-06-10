package testcases;

import org.testng.annotations.Test;


public class UserCheckout_MultipleItems extends BaseTest {

	
	
	
	@Test
	public void MultiItemchkout()
	
	{
		

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homePage.clickLoginMenu();
		
		  String eMail = "Rose@gmail.com";
		  String Psword = "Rose@123";
		  loginPage.logintoApplication(eMail,Psword);
		  String CrdNum = "6857456321456980";
			String ExpMnth = "10";;
			String Expyear = "25";;
			String cvv = "007";	  
		    
		    multipleItempage.multiitems(CrdNum, ExpMnth, Expyear, cvv);
		    multipleItempage.getConfrmOrderMsg();
		    System.out.println("Multiple items order:" +multipleItempage.getConfrmOrderMsg());
		  
		  
	}
	
	
	
	
	
	
	
	
	
	
}
