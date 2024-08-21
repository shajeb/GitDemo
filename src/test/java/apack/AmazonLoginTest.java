package apack;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.AccountPageAmazon;
import PageObject.EmailEnterPage;
import PageObject.PasswordEnterPage;
import PageObject.SignPageAmazon;
import resources.AmazonBase;

public class AmazonLoginTest extends AmazonBase {

	WebDriver driver;
	@Test
	public void login()
	{
		AccountPageAmazon apa = new AccountPageAmazon();
		apa.accountPage().click();
		
		SignPageAmazon spa = new SignPageAmazon();
		spa.signInPage().click();
		
		EmailEnterPage eep = new EmailEnterPage();
		eep.emailField().sendKeys("shajebfaruqui@gmail.com");
		eep.emailContinueButton().click();
		
		PasswordEnterPage pep = new PasswordEnterPage();
		pep.enterPassword().sendKeys("Faruqui7860");
		pep.entersignInButton().click();
		
		
		
		
	}

	@BeforeMethod
	public void openApp() throws IOException
	{
		driver = initializeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
