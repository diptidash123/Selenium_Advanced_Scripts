package MultipleLinksTagName;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("==remote access==");
		WebDriver driver=new ChromeDriver(opt);
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	    WebElement variable=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
	    variable.click();
	    variable.sendKeys("selenium");
	    Thread.sleep(5000);
	    List<WebElement> variable2=driver.findElements(By.tagName("li"));
	    int con=variable2.size();
	    System.out.println(con);
	    for(int i=0;i<con-1;i++)
	    {
	    	System.out.println(variable2.get(i).getText());
	    }
	    driver.close();
//	    System.out.println(variable2.get(1));
	}

}
