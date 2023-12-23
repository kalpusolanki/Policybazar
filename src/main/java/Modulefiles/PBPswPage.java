package Modulefiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Libraryfiles.Utilityclass;

public class PBPswPage 
{
		@FindBy(xpath="//*[@type=\"password\"]")private WebElement Psw;
		@FindBy(xpath="//a/span[text()=\"Sign in\"]") private WebElement SignIn;
		
		public PBPswPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void inputPsw() throws Throwable
		{
			Psw.sendKeys(Utilityclass.PFTestdata("Psw"));
		}
		public void ClickSignIn()
		{
			SignIn.click();
		}
}
