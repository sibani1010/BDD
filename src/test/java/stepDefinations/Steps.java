package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.*;
import pageObjects.LoginPage;

public class Steps {
	
public WebDriver driver;
public LoginPage loginPage;

@Given("User Launch Chrome browser")
public void user_launch_chrome_browser() {
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
    driver = new ChromeDriver();
	loginPage = new LoginPage(driver);
}

@When("User opens URL {string}")
public void user_opens_url(String url) {
    driver.get(url);
    driver.manage().window().maximize();
}

@When("User enters Email as {string} and Password as {string}")
public void user_enters_email_as_and_password_as(String email, String password) {
   
	
	loginPage.setUserName(email);
	loginPage.setPassword(password);
}

@When("Click on Login")
public void click_on_login() {
   
	loginPage.clickLogin();
	
}

@Then("Page Title should be {string}")
public void page_title_should_be(String title) {
	
	if(driver.getPageSource().contains("Login was unsucessful.")) {
		driver.close();
		Assert.assertTrue(false);
	}
	else {
		Assert.assertEquals(title, driver.getTitle());
	}
	
}

@When("User click on Log out link")
public void user_click_on_log_out_link() throws Exception {
 
	loginPage.clickLogout();
	Thread.sleep(3000);
}

@Then("Close browser")
public void close_browser() {
   
driver.close();
}

}
