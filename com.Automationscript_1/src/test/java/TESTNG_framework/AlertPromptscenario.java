package TESTNG_framework;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPromptscenario {

	    @Test
	    public void popup() throws InterruptedException, IOException
	    {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote access--");
	    WebDriver driver = new ChromeDriver(opt); //chrome
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/alerts");
		String actual= driver.getTitle();
		String expected="DEMOQA";
		Assert.assertEquals(expected, actual);
//		Assert.fail();
		System.out.println("The page title is validated successfully");
		System.out.println("Execution is completed");		
		driver.close();

	}

}