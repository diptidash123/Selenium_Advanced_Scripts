package Alerts_scenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts_scenario_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Alert handling ok and cancel button
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("==remote access==");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement perform=driver.findElement(By.xpath("(//button[text()='Click me'])[3]"));
		perform.click();
		Thread.sleep(4000);
		Alert alt=driver.switchTo().alert();
		Thread.sleep(4000);
		alt.accept();
		driver.navigate().refresh();
		WebElement perform1=driver.findElement(By.xpath("(//button[text()='Click me'])[3]"));
//		System.out.println(perform.getText());
//		driver.ge
//		perform1.click();
		Thread.sleep(4000);
		alt.dismiss();
		driver.close();
	}

}
