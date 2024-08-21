package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordEnterPage {

	@FindBy(xpath = "//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")
	WebElement EnterPassword;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement EnterSignInButton;
	
	public WebElement enterPassword()
	{
		return EnterPassword;
	}
	
	public WebElement entersignInButton()
	{
		return entersignInButton();
	}
			
}
