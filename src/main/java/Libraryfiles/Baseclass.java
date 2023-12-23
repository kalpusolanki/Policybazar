package Libraryfiles;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass 
{
			public WebDriver driver;
			public void initializebrowser() throws Throwable
			{
				driver=new ChromeDriver();
				driver.get(Utilityclass.PFTestdata("URL"));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				
			}
}
