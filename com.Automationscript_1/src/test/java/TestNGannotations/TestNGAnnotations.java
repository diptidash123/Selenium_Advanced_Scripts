package TestNGannotations;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations 
{
	@BeforeSuite()
	public void suiteopen()
	{
		System.out.println("Hi testng xml is started here");
	}
	
	@BeforeTest
	public void testopen()
	{
		System.out.println("step3");
	}
	
	@BeforeClass
	public void classopen()
	{
		System.out.println("step5");
	}
	
	@BeforeMethod()
	public void methodopen()
	{
		System.out.println("step7");
	}
	
	@Test(description = "This a login method execution", invocationTimeOut = 20000,invocationCount = 4)
	public void login()
	{
		System.out.println("Hi dipti");
		System.out.println("hi ashutosh");
	}
	
//	@Test(enabled = false)
//	public void createuser()
//	{
//		System.out.println("Hi ashu");
//		System.out.println("hi dip");
//	}
	
	
//	@Test()
//	public void logout()
//	{
//		System.out.println("Hi a");
//		System.out.println("hi d");
//	}
//	
	
	@AfterMethod
	public void methodclose()
	{
		System.out.println("step8");
	}
	
	@AfterClass
	public void classclose()
	{
		System.out.println("step6");
	}
	
	@AfterTest
	public void testclose()
	{
		System.out.println("step4");
	}
	
	
	@AfterSuite
	public void suiteclose()
	{
		System.out.println("Hi testng xml is closed here");
	}
}