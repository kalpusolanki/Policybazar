package Modulefiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Libraryfiles.Utilityclass;

public class PB_Mobno_page 
{
		@FindBy(xpath="(//*[@type=\"number\"])[2]") private WebElement MobNo;
		@FindBy(xpath="(//*[contains(text(),\"Sign in with\")])[4]") private WebElement Signinpsw;
		
		public PB_Mobno_page(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		
		public void InputMobnoPBMobnopage() throws Throwable
		{
			MobNo.sendKeys(Utilityclass.PFTestdata("MobNo"));
		}
		
		public void ClickSigninpsw()
		{
			Signinpsw.click();
		}
}
