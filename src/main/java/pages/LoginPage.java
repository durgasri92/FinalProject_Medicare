package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
	
	
	
	By EmailTextbox = By.id("username");
	By passwordTextbox = By.id("password");
	By loginbtn = By.xpath("//input[@value= 'Login']");

	public LoginPage(ThreadLocal<WebDriver> driver) {
		super(driver);
		PageFactory.initElements(driver.get(), this);
	}

	public void logintoApplication(String Email, String Password) {
		setText(EmailTextbox, Email);
		setText(passwordTextbox, Password);
		clickElement(loginbtn);
	}
       
}




