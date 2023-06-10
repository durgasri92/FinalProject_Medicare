package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckoutSingleItemPage extends BasePage {

	

	By clickViewofProd = By.xpath("//a[@href='/medicare/show/1/product']");
	By AddtoCart = By.xpath("//a[@href='/medicare/cart/add/1/product']");
	By ChkOut = By.xpath("//a[@class='btn btn-success btn-block']");
	By SelectAddr = By.xpath("//a[@class='btn btn-primary']");
	 By InputCardNo = By.id("cardNumber");
	 By  InputMonth = By.id("expityMonth");
	 By InputYear = By.id("expityYear");
	 By InputCVV = By.id("cvCode");
	 By ClickPay = By.xpath("//a[@class='btn btn-success btn-lg btn-block']");
	 By CnfrmOrder = By.xpath("//h3[text()='Your Order is Confirmed!!']");
	 
	 

		public CheckoutSingleItemPage(ThreadLocal<WebDriver> driver) {
			super(driver);
			PageFactory.initElements(driver.get(), this);
		}
     public void addsigleitem(String cardNumber,String expityMonth,String expityYear,String cvCode) 
     
     {
    	 clickUsingJs(clickViewofProd);
    	 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 clickUsingJs(AddtoCart);
    	 clickUsingJs(ChkOut);
    	
    	 clickUsingJs(SelectAddr);
    	 setText(InputCardNo,cardNumber);
    	 setText(InputMonth, expityMonth);
    	 setText(InputYear,expityYear);
    	 setText(InputCVV, cvCode);
    	 clickElement(ClickPay);
    	 
     }
     
     
	 public String getConfirmOrder()
	 {
		 return getText(CnfrmOrder);
	 }	
	 
	 
	 
	 
	
	
}
