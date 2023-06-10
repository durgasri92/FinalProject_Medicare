package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UserSignUpPage extends BasePage {

	
	
	public UserSignUpPage(ThreadLocal<WebDriver> driver) {
		super(driver);
		PageFactory.initElements(driver.get(), this);
	}

	By FnameTextbox = By.name("firstName");
	By LstnameTextbox = By.name("lastName");
	By EmailTextbox = By.id("email");
	By CntNumTextbox = By.id("contactNumber");
	By PswdTextbox = By.id("password");
	By CnfmpswdTextbox = By.name("confirmPassword");
	By Selectradiobtn = By.id("role1");
	By NxtbillingButton = By.xpath("//button[@type= 'submit']");
	By Addressline1Textbox = By.id("addressLineOne");
	By Addressline2Textbox = By.id("addressLineTwo");
	By CityTxtbox = By.name("city");
	By PstlcdeTextbox = By.xpath("//input[@id='postalCode']");
	By StateTxtbox = By.id("state");
	By CntryTxtbox = By.id("country");
	By NxtcnfrmBtn = By.name("_eventId_confirm");
	
	By CnfrmBtn = By.xpath("//a[@class='btn btn-lg btn-primary']");
	By SuccessMessg = By.xpath("//h1[text()= 'Welcome!']");
	
	By Btn = By.xpath("//a[text()= 'Login Here']");
	
	
	public String getSuccessMsge() 
	{
			return getText(SuccessMessg);
	}
public void userPersonalData(String firstName, String lastname, String email,String contactNumber,String password, String confirmPassword) 
	
	{
		
		setText(FnameTextbox,firstName);
		setText(LstnameTextbox,lastname);
		setText(EmailTextbox,email);
		setText(CntNumTextbox,contactNumber);
		setText(PswdTextbox,password);
		setText(CnfmpswdTextbox,confirmPassword);
		clickElement(Selectradiobtn);
		clickElement(NxtbillingButton);
		
	}
	
	public void userAddressInfo(String addressLineOne, String addressLineTwo,String city, String postalCode, String state, String country)
	{
		
		setText(Addressline1Textbox,addressLineOne);
		setText(Addressline2Textbox,addressLineTwo);
		setText(CityTxtbox,city);
		setText(PstlcdeTextbox,postalCode);
		setText(StateTxtbox,state);
		setText(CntryTxtbox,country);
		clickUsingJs(NxtcnfrmBtn);
		clickUsingJs(CnfrmBtn);
	
		
		
		
		
	}
	public String getsuccessMsg() 
	{
			return getText(SuccessMessg);
	}
	
	public void Clicktologin()
	{
		clickUsingJs(Btn);
	}
	
}
