package Modulefiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PbMyacctpage 
{
		@FindBy(xpath="//*[@name=\"personName\"]") private WebElement Name;
		
		
		public PbMyacctpage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public String getname()
		{
			String Actual=Name.getAttribute("value");
			return Actual;
		}
		
}
