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

public class scenario_1 {

	public static void main(String[] args) throws InterruptedException {
		//Perform registration and get the registration message
		//https://spiceclub.spicejet.com/signup
		WebDriverManager.chromedriver().setup();
        ChromeOptions opt=new ChromeOptions();
        opt.addArguments("--remoteaccess--");
        WebDriver driver = new ChromeDriver(opt);
        driver.navigate().to("https://spiceclub.spicejet.com/signup");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //Title webElement  
        WebElement Title=driver.findElement(By.xpath("(//option[@value=\"MR\"])[1]"));
        Title.click();
        //isMultiple method used to check single select or mutliple select dropdown list//
             
        //First Name and Middle Name
        WebElement firstname=driver.findElement(By.xpath("(//input[@class=\"form-control \"])[1]"));
        firstname.sendKeys("DemoseleniumTest");
        Thread.sleep(3000);
        
        //Last Name
        WebElement lastname=driver.findElement(By.xpath("(//input[@class=\"form-control \"])[2]"));
        lastname.sendKeys("Testing");
        Thread.sleep(3000);
        
        //Country/Territory of Residence*
        List<WebElement> countryselection=driver.findElements(By.tagName("option"));
        int length=countryselection.size();
        System.out.println(length);
        driver.findElement(By.xpath("//option[@value=\"IN\"]")).click();
        for(int i=0;i<length-1;i++)
         {
        	System.out.println(countryselection.get(i).getText());
         }
          if (countryselection.contains("India"))
    	    {
			  System.out.println("provided string is present in the dropdown list");
		    }
    	  else
    	    {
    		System.out.println("provided string is not present in the dropdown list");
		    }
          Thread.sleep(3000);          
          //Date of Birth
          WebElement perform=driver.findElement(By.xpath("//input[@class=\"form-control datepicker false\"]"));
          perform.click();
          Thread.sleep(3000);
          Select sel1=new Select(driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]")));
          sel1.selectByVisibleText("March");
          Thread.sleep(3000);
          Select sel2=new Select(driver.findElement(By.xpath("//select[@class=\"react-datepicker__year-select\"]")));
          sel2.selectByVisibleText("1998");
          Thread.sleep(3000);
          driver.findElement(By.xpath("//div[@class=\"react-datepicker__day react-datepicker__day--001 react-datepicker__day--weekend\"]")).click();
          Thread.sleep(3000);
           //Mobile Number
          driver.findElement(By.xpath("//input[@class=\" form-control\"]")).sendKeys("9667586787");
          Thread.sleep(7000);
          
          JavascriptExecutor js1= (JavascriptExecutor) driver;		
          js1.executeScript("window.scrollBy(206.4,43.4)");
          
          //Email ID //xpath is changing dynamically at runtime
          WebElement l = driver.findElement(By.id("new-password"));
          JavascriptExecutor j = (JavascriptExecutor) driver;
          j.executeScript("arguments[0].click();", l);
          
//          WebElement email=driver.findElement(By.xpath("//input[@style=\"border: 1px solid red; box-shadow: none; border-radius: 5px;\"]"));
//          email.sendKeys("seleniumtestdemo@gmail.com");
            Thread.sleep(3000);       
          
          //Password
          WebElement password1=driver.findElement(By.xpath("//input[@id=\"new-password\"]"));
          password1.sendKeys("selenium@!23DeMo");
          Thread.sleep(3000);
          //Confirm Password
          WebElement password11=driver.findElement(By.xpath("//input[@id=\"c-password\"]"));
          password11.sendKeys("selenium@!23DeMo");
          Thread.sleep(3000);
          
          JavascriptExecutor js2 = (JavascriptExecutor) driver;		
          js2.executeScript("window.scrollBy(0,102.89)");
          
          //checkbox click is not performing
          driver.findElement(By.xpath("//input[@id=\"defaultCheck1\"]")).click();
          Thread.sleep(3000);
          
          //submit button
          //WebElement submit=driver.findElement(By.xpath("//button[@class=\"btn btn-red\"]"));
          //submit.click();
          System.out.println("The registration page is successfully script");
          Thread.sleep(3000);
          driver.close();

	}

}
