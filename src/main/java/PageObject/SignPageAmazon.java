package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignPageAmazon {

	@FindBy(xpath = "//div[@class='nav-template nav-flyout-content']//span[contains(text(),'Sign')]")
	WebElement SignInPage;
	
	public WebElement signInPage()
	{
		return signInPage();
	}
}
