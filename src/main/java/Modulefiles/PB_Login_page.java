package Modulefiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB_Login_page 
{
		@FindBy(xpath="//*[@class=\"sign-in\"]") private WebElement SignIn;
		
		
		
		public PB_Login_page(WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		}
		
		
		public void ClickPBLoginPageSIgnIn ()
		{
			SignIn.click();
		}
}
