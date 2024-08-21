package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonBase {

	WebDriver driver;
	public WebDriver initializeDriver() throws IOException
	{
		String str = System.getProperty("user.dir")+"\\src\\main\\java\\resources\\userData.properties";
				
		FileInputStream fis = new FileInputStream(str);
		Properties prop = new Properties();
		prop.load(fis);
		 
		//String str2 = prop.getProperty("browser");
		
		String str2 = "chrome";
		
		if(str2.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(str2.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(str2.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		return driver;
	}
		}
