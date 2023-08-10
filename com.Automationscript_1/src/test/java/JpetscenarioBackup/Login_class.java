package JpetscenarioBackup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_class {
	
	WebDriver driver;
	
	//declaration
	
	@FindBy(xpath = "//a[text()='Sign In']")
	private WebElement singinbutton;
	
	@FindBy(xpath = "//input[@name=\"username\"]")
	private WebElement usernamefield;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement passwordfield;
	
	@FindBy(xpath = "//input[@name=\"signon\"]")
	private WebElement login;
	
	//initialization
	public Login_class(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	//utilization
	public void clicking() throws InterruptedException
	{
		singinbutton.click();
		Thread.sleep(3000);
	}
	
	public void userlogin() throws InterruptedException
	{
		usernamefield.clear();
		usernamefield.sendKeys("Andrew123");
		Thread.sleep(3000);
		passwordfield.clear();
		passwordfield.sendKeys("andrewTest@123");
		Thread.sleep(3000);
	}
	
	public void performclick()
	{
	    login.click();
	}
}
