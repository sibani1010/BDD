package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddcustomerPage {
	
	public WebDriver ldriver;
	
	public AddcustomerPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
		
	}
	
	//By lnk
	

}
