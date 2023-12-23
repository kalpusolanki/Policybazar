package Libraryfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utilityclass 
{
		public static String PFTestdata(String key) throws Throwable
		{
			FileInputStream file = new FileInputStream("C:\\Users\\kalpu\\workspace\\PolicYbzar_V_1\\cresential.properties");
		
			Properties pf = new Properties();
			pf.load(file);
			String value=pf.getProperty(key);
			return value;
		
		}
		
		public static String getTestdata(int a,int b) throws IOException
		{
			FileInputStream file = new FileInputStream("C:\\Users\\kalpu\\workspace\\PolicYbzar_V_1\\testdata\\Policybazarpractice.xlsx");
		
			Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
			String expected = sh.getRow(a).getCell(b).getStringCellValue();
			return expected;
		}
		
		public static void SS(WebDriver driver,int TCID) throws Exception
		{
			File fil = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest= new File("C:\\Users\\kalpu\\workspace\\PolicYbzar_V_1\\\\failedSS\\"+TCID+".png");
			FileHandler.copy(fil, dest);
		}
}
