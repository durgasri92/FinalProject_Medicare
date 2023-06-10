package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SupplierSignUpPage extends BasePage {
	
	
	By fnameTextbox = By.name("firstName");
	By lstnameTextbox = By.name("lastName");
	By emailTextbox = By.id("email");
	By cntNumTextbox = By.id("contactNumber");
	By pswdTextbox = By.id("password");
	By cnfmpswdTextbox = By.name("confirmPassword");
	By Selectradio = By.id("role2");
	By nxtbillingButton = By.xpath("//button[@type= 'submit']");
	By Addresslne1Textbox = By.id("addressLineOne");
	By Addresslne2Textbox = By.id("addressLineTwo");
	By cityTextbox = By.name("city");
	By postalcdeTextbox = By.xpath("//input[@id='postalCode']");
	By stateTextbox = By.id("state");
	By cntryTextbox = By.id("country");
	By NxtcnfmButton = By.name("_eventId_confirm");
	
	By cnfrmButton = By.xpath("//a[text()= 'Confirm']");
	By SuccessMsg = By.xpath("//h1[text()= 'Welcome!']");
	
	By Button = By.xpath("//a[text()= 'Login Here']");
	
	

	public SupplierSignUpPage(ThreadLocal<WebDriver> driver) {
		super(driver);
        PageFactory.initElements(driver.get(), this);
	}
	public void SignUpWithPersonalData(String firstName, String lastname, String email,String contactNumber,String password, String confirmPassword) 
	
	{
		
		setText(fnameTextbox,firstName);
		setText(lstnameTextbox,lastname);
		setText(emailTextbox,email);
		setText(cntNumTextbox,contactNumber);
		setText(pswdTextbox,password);
		setText(cnfmpswdTextbox,confirmPassword);
		clickElement(Selectradio);
		clickElement(nxtbillingButton);
		
	}
	
	public void SignupAddressInfo(String addressLineOne, String addressLineTwo,String city, String postalCode, String state, String country)
	{
		
		setText(Addresslne1Textbox,addressLineOne);
		setText(Addresslne2Textbox,addressLineTwo);
		setText(cityTextbox,city);
		setText(postalcdeTextbox,postalCode);
		setText(stateTextbox,state);
		setText(cntryTextbox,country);
		clickUsingJs(NxtcnfmButton);
		 
		clickUsingJs(cnfrmButton);
		
		
		
		
		
		
	}
	public String getsuccessmsg() 
	{
			return getText(SuccessMsg);
	}
	
	public void ClicktoLogin()
	{
		clickUsingJs(Button);
	}
	
}
