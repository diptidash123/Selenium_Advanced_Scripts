package TESTNG_framework;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotation
{
	
	@BeforeTest
	public void preconditions()
	{
		System.out.println("opening browser");
	}
	
	@Test(priority=1)
	public void CompareStrings() 
	{
    String exp1="Hello we are in day1 of testng";
	String act1 = "Hello we Are in Day1 Of TESTNG";
	boolean b = exp1.equals(act1);
	System.out.println(b);
	}

	 @Test(priority=2)
	 public void ArrayDisp() 
	 {
	 String arr[] = {"Hello","World"};
	 // String act1 = "Hello we Are in Day1 Of TESTNG";
	 for(String o : arr) 
	 {
	 System.out.println(o);
	 }
	 }
	@Test(priority=3)
	public void NameOfTrainer() {
	System.out.println("TrainerUser001");
	}
	
	@Test(priority = 4)
	public void student() 
	{
	System.out.println("TrainerUser002");
	}
	
	@AfterTest
	public void afterconditions()
	{
		System.out.println("closing the browser");
	}
	
	}
