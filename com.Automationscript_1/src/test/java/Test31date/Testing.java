package Test31date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//case study_1
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dipti Ranjan Dash\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String store=driver.getCurrentUrl();
		String actualurl="https://www.saucedemo.com/";
		if (actualurl.equals(store)) {
			System.out.println("The url is success validated");
			
		}
		else {
			System.out.println("The url is not success validated");
		}
		Thread.sleep(2000);
	    String	actualtitle=driver.getTitle();
	    String  expectedtitle="Swag Labs";
	    if (expectedtitle.equals(actualtitle)) {
	    	System.out.println("Title is fetched correctly");
			
		}
	    else {
			System.out.println("Title is fetched incorrectly");
		}
		driver.findElement(By.xpath("(//input[@class=\"input_error form_input\"])[1]")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
		Thread.sleep(2000);
		System.out.println("user redirected to the dashboard page successfully");
		driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id=\"logout_sidebar_link\"]")).click();
		driver.close();
	}

}