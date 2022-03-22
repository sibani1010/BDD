package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddcustomerPage {
	
	public WebDriver ldriver;
	
	public AddcustomerPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
		
	}
	
	By lnkCustomers_menu = By.xpath("//a[@href='#']/p[contains(text(),'Customers')]");
	By lnkCustomers_menuitem = By.xpath("//li[@class='nav-item']/a[@href='/Admin/Customer/List']/p");
    By btnAddnew = By.xpath("//a[@class='btn btn-primary']");
    
    By txtEmail = By.xpath("//input[@id='Email']");
    By txtPassword = By.xpath("//input[@id='Password']");
    By txtFisrtName = By.xpath("//input[@id='FirstName']");
    By txtLastName = By.xpath("//input[@id='LastName']");
    By rbGenderMale = By.id("Gender_Male");
    By rbGenderFemale = By.id("Gender_Female");
    By calender = By.id("DateOfBirth");
    By companyName = By.id("Company");
    By taxExempt = By.id("IsTaxExempt");
    By newsLetter = By.id("SelectedNewsletterSubscriptionStoreIds_taglist");
    By customerRoles = By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");
    By commentBox = By.id("AdminComment");
    By btnSave = By.name("save");
    
    
    //Action Methods
    
    
    public String getPageTitle() {
    	
    	return ldriver.getTitle();
    }
    public void clickOnCustomersMenu() {
    	ldriver.findElement(lnkCustomers_menu).click();
    }
    
    public void clickOnCutomersMenuItem() {
    	
    	ldriver.findElement(lnkCustomers_menuitem).click();
    }
    
    public void clickOnAddnew() { 
    	ldriver.findElement(btnAddnew).click();
    }
    
    public void setEmail(String email) {
    	
    	ldriver.findElement(txtEmail).sendKeys(email);
    }
    
    public void setPassword(String password) {
    	
    	ldriver.findElement(txtPassword).sendKeys(password);
    }
    
    
    public void setGender(String gender) {
    	
    	if(gender.equals("Male")) {
    		ldriver.findElement(rbGenderMale).click();
    	}
    	
    	if(gender.equals("Female")) {
    		ldriver.findElement(rbGenderFemale).click();
    	}
    	else {
    		ldriver.findElement(rbGenderMale).click();
    		
    	}
    		
    }
 
    public void setFirstName(String fname) {
    	
    	ldriver.findElement(txtFisrtName).sendKeys(fname);
    }
    
    public void setLastName(String lname) {
    	
    	ldriver.findElement(txtLastName).sendKeys(lname);
    }
    
    public void setDob(String dob) {
    	
    	ldriver.findElement(calender).sendKeys(dob);
    }
    
   public void setCompanyName(String cname) {
    	
    	ldriver.findElement(companyName).sendKeys(cname);
    }
    
   
   public void setAdminContent(String comment) {
   	
   	ldriver.findElement(commentBox).sendKeys(comment);
   }
    
   
   public void clickOnSave()  {
	   ldriver.findElement(btnSave).click();
	   
   }
    

}
