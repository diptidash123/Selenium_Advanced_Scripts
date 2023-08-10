package JpetscenarioBackup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass_2 extends Login_class
{

	public Testclass_2(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");
		
		Login_class p1=new Login_class(driver);
		p1.clicking();
		p1.userlogin();
		p1.performclick();
		driver.close();
		
		

	}

}
