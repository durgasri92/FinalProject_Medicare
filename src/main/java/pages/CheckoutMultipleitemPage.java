package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckoutMultipleitemPage extends BasePage {

	
	By clickViewofProd = By.xpath("//a[@href='/medicare/show/1/product']");
	By AddtoCart = By.xpath("//a[@class='btn btn-success']");
	By ClickCntnueShopping = By.xpath("//a[@class ='btn btn-warning']");
	By ClktoviewItem = By.xpath("//a[@href='/medicare/show/2/product']");
	By AddSeconditemtoCart = By.xpath("//a[@href='/medicare/cart/add/2/product']");
	By ChkOutMultiItems = By.xpath("//a[@href='/medicare/cart/validate']");
	By SelectMAddr = By.xpath("//a[@class='btn btn-primary']");
	 By InputMCardNo = By.id("cardNumber");
	 By InputMMonth = By.id("expityMonth");
	 By InputMYear = By.id("expityYear");
	 By InputMCVV = By.id("cvCode");
	 By ClickMPay = By.xpath("//a[@class='btn btn-success btn-lg btn-block']");
	 By CnfirmOrder = By.xpath("//h3[text()='Your Order is Confirmed!!']");
	
	
	
	 
	

	public CheckoutMultipleitemPage(ThreadLocal<WebDriver> driver) {
		super(driver);
		PageFactory.initElements(driver.get(), this);
	}
	public void multiitems(String cardNumber,String expityMonth,String expityYear,String cvCode ) 
	{
		
	 clickUsingJs(clickViewofProd);
	 clickUsingJs(AddtoCart);
	 clickUsingJs(ClickCntnueShopping);
	 clickUsingJs(ClktoviewItem);
	 clickUsingJs(AddSeconditemtoCart);
	 clickUsingJs(SelectMAddr);
	 setText(InputMCardNo,cardNumber);
	 setText(InputMMonth, expityMonth);
	 setText(InputMYear,expityYear);
	 setText(InputMCVV, cvCode);
	 clickElement(ClickMPay);
	}
	 public String getConfrmOrderMsg()
	 {
		 return getText(CnfirmOrder);
	 }
	
	
	
	
	
	
	
	
}
