package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase 
{
	public static WebDriver driver;
	public static Properties prop;
	
	protected TestBase()
	{
		try
		{
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:/Users/Acer/eclipse-workspace/DemoProject01/src/test/java/config/config.properties");
			prop.load(fis);
		}
		catch(IOException ex)
		{
			ex.getMessage();
		}
	}
	
	public static void initialization() 
	{
		String browserName = prop.getProperty("Browser");
		String loginType = prop.getProperty("UserType");
		 
		if(browserName.equals("Chrome"))
		{
			ChromeOptions options = new ChromeOptions();
			System.setProperty("webdriver.chrome.driver", "C:/TestAutomation/01Drivers/chromedriver-win64_V_125/chromedriver.exe");
			options.addArguments("incognito");
			
			//driver = new ChromeDriver();
			driver = new ChromeDriver(options);
		}
		else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:/TestAutomation/01Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("URL"));			
		
	}	
	public void PerformAction(String identifier,String action,String testdata)
 	{
 		switch (action)
 		{
 			case ("EnterText"):
 			{
 				driver.findElement(By.xpath(identifier)).sendKeys(testdata);
 			}
 			case ("Click"):
 			{
 				driver.findElement(By.xpath(identifier)).click();
 			}
 		}
 	}
}
