package testcases;

import org.testng.annotations.Test;



public class UserChekout_SingleItem extends BaseTest{

	
	@Test
	public void chkoutSingleitem()
	{try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		homePage.clickLoginMenu();
		
	  String Mail = "Rose@gmail.com";
	  String Pswrd = "Rose@123";
				
		loginPage.logintoApplication(Mail,Pswrd);
		
		String CardNo = "6857456321456980";
		String EMnth = "10";
		String Eyear = "25";
		String CVV = "007";
	
		singleitempage.addsigleitem(CardNo, EMnth, Eyear, CVV);
				
	 singleitempage.getConfirmOrder();
		System.out.println("Single item order:" + singleitempage.getConfirmOrder());
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
