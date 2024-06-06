package IT0_Sprint_01;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.ExecuteTest_Login;
import utils.TestBase;

public class test_IT0_1_Login extends TestBase
{

	@BeforeTest
	public void openApplication()
	{
		initialization();
	}
	
	
    @Test
    public void LoginApplication()
    {    	
    	ExecuteTest_Login lo = new ExecuteTest_Login();
    	boolean flag = lo.validateURL();
    	//assert.assertTrue(lo.validateURL(), "h");
    	lo.login();    	
    	System.out.println(flag);
    }
}
