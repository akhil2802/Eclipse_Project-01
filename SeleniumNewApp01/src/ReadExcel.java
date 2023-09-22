import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadExcel {
	public static void main(String[] args) {
		
		/*
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.fb.com");
		driver.findElement(By.name("email")).sendKeys("selauto2802@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("testing123");
		driver.findElement(By.name("login")).click();
		*/
		
//		Excel Reading Using POI API:
		
		try {
//			Open the Excel file:
			File file = new File("test_data.xlsx");
	        FileInputStream inputStream = new FileInputStream(file);
	        
	        // Create a workbook object using XSSFWorkbook class
	        Workbook workbook = new XSSFWorkbook(inputStream);
	        
	        // Get the first sheet from the workbook
	        Sheet sheet = workbook.getSheetAt(0);
	        
	        // Iterate over rows and columns
	        for (Row row : sheet) {
	            for (Cell cell : row) {
	                // Get the cell value and print it
	                String cellValue = cell.getStringCellValue();
	                System.out.print(cellValue + "\t");
	            }
	            System.out.println();
	        }
	        
	        // Close the workbook and input stream
	        workbook.close();
	        inputStream.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
