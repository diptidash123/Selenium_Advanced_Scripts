package FileDownload_upload_popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileupload_popup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("==remote access");
		WebDriver driver=new ChromeDriver(opt);
		driver.navigate().to("https://www.foundit.in/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.findElement(By.xpath("//div[@class=\"heroSection-buttonContainer_secondaryBtn__text\"]")).click();
        //sendkeys method through handle
//        WebElement folder=driver.findElement(By.xpath("//input[@id=\"file-upload\"]"));
//        folder.sendKeys("C:\\Users\\Dipti Ranjan Dash\\Downloads\\Selenium Notes (1).pdf");
//        Thread.sleep(5000);
//        folder.submit();
//        WebElement folder=driver.findElement(By.xpath("//input[@id=\"file-upload\"]"));
        WebElement folder1=driver.findElement(By.cssSelector("file"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", folder1);
        StringSelection str=new StringSelection("C:\\Users\\Dipti Ranjan Dash\\Downloads\\Selenium Notes (1).pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);
        Robot rb=new Robot();
        rb.delay(2000);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        Thread.sleep(3000);
        
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        Thread.sleep(3000);
        
        rb.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        folder1.submit();
        System.out.println("successfully uploaded");
        driver.close();
        
	}

}