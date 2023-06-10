package testcases;




import org.testng.annotations.Test;



public class SupplierSignup_Login extends BaseTest {
	
	@Test
	public void SignupSupplr()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		homePage.SignupButton();
		
		String Fname = "Max";
				
		String LName = "well";	
		String Mail = "Max5@gmail.com";
		String CntNum = "6548973215";	
		String Pswd = "Apple!123";
		String CnfPswd = "Apple!123";	
		
		supplierSignuppage.SignUpWithPersonalData(Fname, LName, Mail, CntNum, Pswd,CnfPswd);
		
		String AddLnOne = "newmanstreet";
		String AddLntwo = "bakers road";
		String CT = "Hyderabad";
		String PSTCD = "500015";
		String ST = "Telangana";
		String CN = "India";
		
		
		supplierSignuppage.SignupAddressInfo(AddLnOne,AddLntwo,CT,PSTCD,ST,CN);
	
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		supplierSignuppage.getsuccessmsg();
		System.out.println("Supplier:" + supplierSignuppage.getsuccessmsg());
	    supplierSignuppage.ClicktoLogin();
		
		
		
	}
	
	
	

}
