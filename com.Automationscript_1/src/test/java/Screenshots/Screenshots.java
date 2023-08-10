package Screenshots;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions opt=new FirefoxOptions();
		opt.addArguments("==remote access===");
		WebDriver driver=new FirefoxDriver(opt);
		driver.get("https://www.ilovepdf.com/pdf_to_powerpoint");
		FileReader file=new FileReader("D:\\Eclipse Folder\\com.Automationscript_1\\uploadfilepdf\\Selenium Notes (1).pdf");
		Properties p=new Properties();
		p.load(file);
		WebElement folder=driver.findElement(By.xpath("//span[.='Select PDF file']"));
		folder.click();
//		folder.sendKeys("C:\\Users\\Dipti Ranjan Dash\\Downloads\\Selenium Notes (1).pdf");
		Thread.sleep(3000);
		driver.close();

	}

}
