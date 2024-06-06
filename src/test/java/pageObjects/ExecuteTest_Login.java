package pageObjects;

import org.openqa.selenium.By;

import utils.TestBase;

public class ExecuteTest_Login  extends TestBase
{

	String expectedLoginURL = "http://localhost:90/GBS_Demo/Login.aspx";
	String expectedLoginPageTitle = "";
	
	public ExecuteTest_Login() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void login() 
	{
	PerformAction("//input[@id='txtUserID']", "EnterText", "#99");
	PerformAction("//input[@id='txtPassword']", "EnterText", "99");
	PerformAction("//input[@id='btnLogin']", "Click", "");
	}
	
	public boolean validateURL()
	{
		if(expectedLoginURL.contentEquals(driver.getCurrentUrl()))
			return true;
		else
			return false;					
	}
 	
}
