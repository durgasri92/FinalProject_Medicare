package testcases;

import org.testng.annotations.Test;



public class UserSinup_Login extends BaseTest {

	
	
	
	@Test
	public void UserDetails() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		homePage.SignupButton();
		
		String Fstname = "Rose";
		String LstName = "Merlin";	
		String eMail ="Rose4@gmail.com";
		String ContNum = "58964753";	
		String Paswrd = "Rose@123";
		String CnfmPswd = "Rose@123";	
		
		usersignuppage.userPersonalData(Fstname, LstName, eMail, ContNum, Paswrd,CnfmPswd);
		
		String AddLn1 = "Anna Nagar";
		String AddLn2 = "opp Indian Bank";
		String Cty = "chennai";
		String Pstcd = "625984";
		String St = "TamilNadu";
		String Cn = "India";
		
		
		usersignuppage.userAddressInfo(AddLn1,AddLn2,Cty,Pstcd,St,Cn);
		usersignuppage.getsuccessMsg();
		System.out.println("User:" + usersignuppage.getsuccessMsg());
		usersignuppage.Clicktologin();
	}
}
