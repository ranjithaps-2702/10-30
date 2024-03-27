package excel2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class e2 {

	@Test
	public void ab() throws IOException
	{
		File f=new File("C:\\Users\\Admin\\OneDrive\\Desktop\\march month report.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook x=new XSSFWorkbook(fis);
		XSSFSheet sheet=x.getSheet("Data");
		
	
				int row=sheet.getLastRowNum();
				System.out.println("Number of rows "+ row);
				
				
				int col=sheet.getRow(0).getLastCellNum();
				System.out.println("Number of column"+col);
				
				
				
				XSSFCell data = sheet.getRow(1).getCell(1);
				System.out.println(data);
		
		
		sheet.getRow(5).createCell(3).setCellValue("hi");
		FileOutputStream fos=new FileOutputStream(f);
		x.write(fos);
		
		
	}
	
	
}
