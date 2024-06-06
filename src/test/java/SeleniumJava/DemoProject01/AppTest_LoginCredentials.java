package SeleniumJava.DemoProject01;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.ExecuteTest_Login;
import utils.TestBase;


/**
 * Unit test for simple App.
 */
public class AppTest_LoginCredentials extends TestBase
{
    /**
     * Rigorous Test :-)
     */
	@BeforeTest
	public void openApplication()
	{
		initialization();
	}
	
	
    @Test
    public void LoginApplication()
    {
    	ExecuteTest_Login lo = new ExecuteTest_Login();
    	lo.login();
    }
}
