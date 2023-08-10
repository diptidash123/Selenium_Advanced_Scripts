package AshutoshPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
	    opt.addArguments("===remote access====");
	    WebDriver driver=new ChromeDriver(opt);
	    driver.navigate().to("https://twoplugs.com/");
	    driver.findElement(By.xpath("/html/body/div/header/div/nav/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class=\"jq-selectbox jqselect dropdown opened\"]")).click();
	    List<WebElement> ele=(List<WebElement>) driver.findElement(By.tagName("select"));
	    System.out.println(ele);
//	    Thread.sleep(5000);
//	    Select sel=new Select(ele);
////	    sel.selectByValue("Accommodation & Travel");
//	    sel.selectByVisibleText("Accommodation & Travel");
//	    System.out.println("closing success validated");
	    driver.close();
	}

}
