package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage {
	// page locators
		By signUpBtn = By.xpath("//a[normalize-space()='Sign Up']");
		By loginBtn = By.xpath("//a[normalize-space()='Login']");

		public HomePage(ThreadLocal<WebDriver> driver) {
			super(driver);
			PageFactory.initElements(driver.get(), this);
			
		}

		public void SignupButton() {
			clickElement(signUpBtn);

		}


		public void clickLoginMenu() {
			clickElement(loginBtn);

		}
}
