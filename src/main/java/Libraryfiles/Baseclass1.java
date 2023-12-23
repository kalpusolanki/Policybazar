package Libraryfiles;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass1 
{
			public WebDriver driver;
			public void initializebrowser(String browsername) throws Throwable
			{
				if(browsername.equals("chrome"))
				{
				driver=new ChromeDriver();
				}
				else if(browsername.equals("fire"))
				{
				driver=new FirefoxDriver();
				}
				else if(browsername.equals("edge"))
				{
				driver=new EdgeDriver();
				}
				driver.get(Utilityclass.PFTestdata("URL"));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				
			}
}

