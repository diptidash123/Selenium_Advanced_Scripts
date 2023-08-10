package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectTopics {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("==remote access==");
	WebDriver driver=new ChromeDriver(opt);
    driver.get("https://demo.guru99.com/test/newtours/register.php");
    Thread.sleep(2000);
    Select sel= new Select(driver.findElement(By.xpath("//select[@name=\"country\"]")));
    sel.selectByIndex(5);
    sel.selectByValue("BELGIUM");
    sel.selectByVisibleText("BERMUDA");
}
}