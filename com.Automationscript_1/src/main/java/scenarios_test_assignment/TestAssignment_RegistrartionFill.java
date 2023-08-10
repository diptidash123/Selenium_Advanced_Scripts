//package scenarios_test_assignment;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.Select;
//
//import com.google.errorprone.annotations.Var;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class TestAssignment_RegistrartionFill {
//
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//        ChromeOptions opt=new ChromeOptions();
//        opt.addArguments("--remoteaccess--");
//        WebDriver driver = new ChromeDriver(opt);
//        driver.navigate().to("https://spiceclub.spicejet.com/signup");
//        driver.manage().window().maximize();
//        Thread.sleep(3000);
//        WebElement firstdropdown =driver.findElement(By.xpath("//select[@class='form-control form-select ']"));
//        System.out.println(firstdropdown.isDisplayed());
//        boolean Result=firstdropdown.isSelected();
//        System.out.println(Result);
//        Thread.sleep(3000);
//        
//        //salutation selection
//        WebElement clk=driver.findElement(By.xpath("//option[.='Mr']"));
//        clk.click();
//        Thread.sleep(3000);
////      driver.close();z
//        //username and middle name
//        WebElement username=driver.findElement(By.xpath("(//input[@class='form-control '])[1]"));
//        username.click();
//        username.sendKeys("Dipti Ranjan");
//        Thread.sleep(3000);
//        
//        //lastname
//        WebElement lastname=driver.findElement(By.xpath("(//input[@class='form-control '])[2]"));
//        lastname.click();
//        lastname.sendKeys("Dash");
//        Thread.sleep(3000);
//        
//        //List<WebElement> arrayBox= driver.findElements(By.tagName("option"));
//        ArrayList<WebElement> arr=(ArrayList<WebElement>) driver.findElements(By.tagName("option"));
//        int contain=arr.size();
//        System.out.println(contain);
//        String wbc="India";
//       
//        for(int i=0;i<=contain-1;i++)
//        {
//        	String str= arr.get(i).getText();
//        }
//        if (arr.cont
//        {
//			System.out.println("India is present in the dropdown list");
//		}
//        else 
//        {
//        	System.out.println("Not present");
//        }
//        
//        //dropdown handle
//        WebElement var=driver.findElement(By.xpath("//input[@id=\"dobDate\"]"));
//        var.click();
//        Select sel=new Select(driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]")));
//        Thread.sleep(2000);
//        sel.selectByVisibleText("March");
//        Thread.sleep(2000);
//        Select sel1=new Select(driver.findElement(By.xpath("//select[@class=\"react-datepicker__year-select\"]")));
//        Thread.sleep(2000);
//        sel1.selectByValue("1998");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[@class=\"react-datepicker__day react-datepicker__day--005\"]")).click();
//        Thread.sleep(1000);
//        driver.close();
//        //static dropdown handle
//        
//        
//    
//            
//	}
//
//}