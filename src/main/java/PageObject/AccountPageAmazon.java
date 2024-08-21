package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPageAmazon {

	@FindBy(xpath = "//div[@id='nav-tools']//a[@class='nav-a nav-a-2   nav-progressive-attribute'][1]")
	WebElement AccountPage;
	
     public WebElement accountPage()
     {
    	 return AccountPage;
     }
	
	
}
