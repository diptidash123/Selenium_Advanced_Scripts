package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DDTClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://petstore.octoperf.com/actions/Account.action?signonForm=");
        File file =new File("./TestData/New Microsoft Excel Worksheet.xls");
        FileInputStream instr = new FileInputStream(file);
        //creating workbook instance that refers to .xls file
        HSSFWorkbook wb=new HSSFWorkbook(instr);
        HSSFSheet sheet=wb.getSheet("Sheet1"); 
        //Total number of rows for iterations
        int itr=sheet.getLastRowNum()-sheet.getFirstRowNum();
        WebElement UName=driver1.findElement(By.name("username"));
        WebElement Passcode=driver1.findElement(By.name("password"));
        for(int i=1;i<=itr;i++) {
           UName.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
           Thread.sleep(1000);
           Passcode.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
           UName.clear();
           Passcode.clear();
           Thread.sleep(3000);
           driver1.close();
		}
	}
}