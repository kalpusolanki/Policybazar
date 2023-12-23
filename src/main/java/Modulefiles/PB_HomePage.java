package Modulefiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB_HomePage 
{
	WebDriver driver1;
	@FindBy(xpath="//a/div[text()=\"My Account\"]") private WebElement myAcct;
	@FindBy(xpath="//*[text()=\" My profile \"]") private WebElement Myprofile;
	
	
	public PB_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void DDMyacctPBHomePage()
	{
		Actions act = new Actions(driver1);
		act.moveToElement(myAcct).build().perform();
	}
	public void clickmyprofile()
	{
		Myprofile.click();
	}

}
