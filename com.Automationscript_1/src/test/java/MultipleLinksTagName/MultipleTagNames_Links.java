package MultipleLinksTagName;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleTagNames_Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("==remote access==");
		WebDriver driver=new ChromeDriver(opt);
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		List<WebElement> variable=(List<WebElement>) driver.findElements(By.tagName("a"));
		int contain=variable.size();
		System.out.println(contain);
		
		for(int i=0;i<contain-1;i++)
		{
			System.out.println(variable.get(i).getText());
		}
	}

}
