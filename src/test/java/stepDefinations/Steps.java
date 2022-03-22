package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.*;

import pageObjects.AddcustomerPage;
import pageObjects.LoginPage;

public class Steps extends BaseClass {
	


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


//Customers feature



@Then("User can view Dashboard")
public void user_can_view_Dashboard() {
   
	addCust= new AddcustomerPage(driver);
	Assert.assertEquals("Dashboard / nopCommerce administration",addCust.getPageTitle());
	
}

@When("User click on cutomers Menu")
public void user_click_on_cutomers_Menu() throws InterruptedException {
	Thread.sleep(3000);
   addCust.clickOnCustomersMenu();
}

@When("click on customers Menu Item")
public void click_on_customers_Menu_Item() throws InterruptedException {
	Thread.sleep(3000);
	addCust.clickOnCutomersMenuItem();
   
}

@When("click on Add new button")
public void click_on_Add_new_button() throws InterruptedException {
	addCust.clickOnAddnew();
	Thread.sleep(3000);
    
}

@Then("User can view Add new customer page")
public void user_can_view_Add_new_customer_page() {
	
	Assert.assertEquals("Add a new customer / nopCommerce administration",addCust.getPageTitle());
	
   
}
@When("User enter customer info")
public void user_enter_customer_info() {
    
	String email = randomString()+"@gmail1.com";
	addCust.setEmail(email);
	addCust.setPassword("test123");
	addCust.setGender("Male");
	addCust.setFirstName("abcd");
	addCust.setLastName("efgh");
	addCust.setDob("8/09/1997");
	addCust.setCompanyName("okok");
	addCust.setAdminContent("comments.....");
	
}

@When("click on Save button")
public void click_on_Save_button() throws InterruptedException {
    addCust.clickOnSave();
    Thread.sleep(3000);
}

@Then("User can view confirmation message {string}")
public void user_can_view_confirmation_message(String message) {
	
	Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
			.contains("The new customer has been added successfully"));
		
}


}
