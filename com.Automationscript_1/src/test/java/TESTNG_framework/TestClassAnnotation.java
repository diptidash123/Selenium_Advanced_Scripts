//package TESTNG_framework;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class TestClassAnnotation {
//	WebDriver driver;
//	@BeforeSuite
//	public void beforesuite()
//	{
//		System.out.println("execution started");
//	}
//	@BeforeTest
//	public void Pre_Condition_Check() {
//	WebDriverManager.chromedriver().setup();
//	ChromeOptions opt=new ChromeOptions();
//	opt.addArguments("--remote access--");
//	driver = new ChromeDriver(opt); // chrome
//	driver.manage().window().maximize();
//	driver.manage().deleteAllCookies();
//	}
//	@Test(priority=1)
//	public void Invoke_Google() {
//	// Invoking the google application
//	driver.get("https://www.google.com");
//	}
//	@Test(priority=2)
//	public void Input_Search_String() throws InterruptedException {
//	//Sending the search string
//	driver.findElement(By.name("q")).sendKeys("dipti");
//	Thread.sleep(2000);
//	}
//
//	@Test(priority=3)
//	public void Click_On_Enter_Key() throws InterruptedException {
//	//Sending the search string
//	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	Thread.sleep(2000);
//	}
//
//	@AfterTest
//	public void postcondition_check() throws InterruptedException {
//	//close the browser app
//	Thread.sleep(1000);
//	driver.close();
//	
//////	@AfterSuite
////////	public void aftersuite()
//////	{
//////	System.out.println("execution closed");
//////	}
//////	}
////}
