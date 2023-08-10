package Alerts_scenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertClickButtontoseealert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        //Click Button to see alert
		//System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("==remote access==");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]")).click();
		Thread.sleep(5000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		System.out.println("The result is successfully");
		driver.close();
		
		
	}

}
