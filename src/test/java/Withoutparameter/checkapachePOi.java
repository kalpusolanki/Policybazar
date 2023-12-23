package Withoutparameter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class checkapachePOi 
{
	@Test
		public void checexcelfile() throws Exception
		{
			FileInputStream file= new FileInputStream("C:\\Users\\kalpu\\workspace\\PolicYbzar_V_1\\testdata\\Policybazarpractice.xlsx");
			
			Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
			String N1 = sh.getRow(0).getCell(0).getStringCellValue();
			System.out.println(N1);
		}
}
