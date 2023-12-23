package Modulefiles;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyprofilepage 
{
	WebDriver driver1;
		@FindBy(xpath="//*[@class=\"custom__popup__header\"]") private WebElement POPUP;
	

	public PBMyprofilepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	public void SwitchtoChildWindow()
	{
		Set<String> as = driver1.getWindowHandles();
		ArrayList<String> S1=new ArrayList<String>(as);
		driver1.switchTo().window(S1.get(1));
	}
	public void ClickPopyp()
	{
		POPUP.click();
	}
}
