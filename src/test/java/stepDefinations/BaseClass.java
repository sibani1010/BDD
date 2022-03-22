package stepDefinations;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObjects.AddcustomerPage;
import pageObjects.LoginPage;

public class BaseClass {

	
	public WebDriver driver;
	public LoginPage loginPage;
	public AddcustomerPage addCust;
	
	public static String randomString()
	{
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
		
	}
	
}
