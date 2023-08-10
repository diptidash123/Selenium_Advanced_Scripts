package AssignmentQuestions_10May2023;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scenario_2 {

	public static void main(String[] args) throws InterruptedException {
		//Perform registration and get the registration message
		//https://spiceclub.spicejet.com/signup
		WebDriverManager.chromedriver().setup();
        ChromeOptions opt=new ChromeOptions();
        opt.addArguments("--remoteaccess--");
        WebDriver driver = new ChromeDriver(opt);
        driver.navigate().to("https://www.makemytrip.com/flights/");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        List<WebElement> listing=driver.findElements(By.tagName("p"));
        int length=listing.size();
        System.out.println(length);
        for(int i=0;i<length-1;i++)
        {
        	System.out.println(listing.get(i).getText());
        }
        driver.close();
        
	}

}
