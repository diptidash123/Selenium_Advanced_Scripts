package Alerts_scenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertscen{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote access--");
	    WebDriver driver = new ChromeDriver(opt); // chrome
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/alerts");
		Thread.sleep(5000);
		System.out.println("On button click, confirm box will appear");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		Thread.sleep(5000);
		Alert alt=driver.switchTo().alert();
		Thread.sleep(5000);
		alt.accept();//ok
		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		Thread.sleep(5000);
		Alert alt1=driver.switchTo().alert();
		Thread.sleep(5000);
		alt1.dismiss();
		Thread.sleep(5000);
		driver.close();
		
		
		
		

	}

}
