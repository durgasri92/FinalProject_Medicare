package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

//import data.DataUtils;

import pages.CheckoutMultipleitemPage;
import pages.CheckoutSingleItemPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SupplierSignUpPage;
import pages.UserSignUpPage;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
public abstract class BaseTest {

	 protected ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	protected CheckoutSingleItemPage singleitempage;
	protected CheckoutMultipleitemPage multipleItempage;
	protected HomePage homePage;
	protected LoginPage loginPage;
	protected SupplierSignUpPage supplierSignuppage;
	protected UserSignUpPage usersignuppage;
	

	
	@BeforeMethod(alwaysRun = true)
	protected void validate_HomePage()
	{ 
		WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());
		

		driver.get().manage().window().maximize();
		driver.get().manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get().get("http://localhost:8080/medicare");
		initializePageObjects();
	}
	
	private void initializePageObjects() {
		singleitempage = new CheckoutSingleItemPage(driver);
		multipleItempage = new CheckoutMultipleitemPage(driver);
		homePage = new HomePage(driver); 
		loginPage = new LoginPage(driver);
		supplierSignuppage = new SupplierSignUpPage(driver);
		usersignuppage = new UserSignUpPage(driver);
		
	}	
	
	
	@AfterMethod
	protected void cleanUpActivities() {
//quit chrome driver sessions
	driver.get().quit();
	
	}
	
}
