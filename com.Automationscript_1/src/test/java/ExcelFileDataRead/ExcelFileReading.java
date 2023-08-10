package ExcelFileDataRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelFileReading 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		File file =new File("./TestData/New Microsoft Excel Worksheet.xls");
		FileInputStream instr = new FileInputStream(file);//
		//creating workbook instance that refers to .xls file
		HSSFWorkbook wb=new HSSFWorkbook(instr);
		HSSFSheet sheet=wb.getSheet("Sheet1");
		//Total number of rows for iterations
		int itr=sheet.getLastRowNum()-sheet.getFirstRowNum();
		System.out.println("The number of iterations : "+ " " + itr); 
//		System.out.println( sheet.getRow(2).getCell(0).getStringCellValue());
		System.out.println();
//		System.out.println( sheet.getRow(2).getCell(1).getStringCellValue());
		System.out.println();
//		System.out.println( sheet.getRow(3).getCell(2).getNumericCellValue());
		
		for(int j=1;j<=itr;j++) 
		{
			System.out.println(sheet.getRow(j).getCell(0).getStringCellValue());

	    }
    }
}