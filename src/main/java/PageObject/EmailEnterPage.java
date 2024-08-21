package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailEnterPage {

	@FindBy(xpath="//input[@id='ap_email']")
	WebElement EmailField;
	
	@FindBy(xpath = "//input[@class='a-button-input']")
	WebElement EmailContinueButton;
	
	public WebElement emailField()
	{
		return emailField();
	}
	
	public WebElement emailContinueButton()
	{
		return emailContinueButton();
	}

}
