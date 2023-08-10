package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownselectHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("==remote access==");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		Select sel = new Select(driver.findElement(By.xpath("//select[@name=\"country\"]")));
		// Select a single element from drop down
		//sel.selectByIndex(5);
		// sel.selectByValue("BELGIUM");
		// sel.selectByVisibleText("BERMUDA");
        ArrayList<WebElement> slist= (ArrayList<WebElement>) sel.getOptions(); 
        System.out.println("No of options available in list: " + " " + slist.size());
        for(int i=0;i<slist.size();i++) {
        String cnt = slist.get(i).getText();
        if(cnt.contains("INDIA")) 
        {
           System.out.println("Valid list");
           break;
        }
}}}