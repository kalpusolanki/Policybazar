package Withoutparameter;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Libraryfiles.Baseclass1;
import Libraryfiles.Utilityclass;
import Modulefiles.PBMyprofilepage;
import Modulefiles.PBPswPage;
import Modulefiles.PB_HomePage;
import Modulefiles.PB_Login_page;
import Modulefiles.PB_Mobno_page;
import Modulefiles.PbMyacctpage;

public class TcPBveriftynamewithparameter extends Baseclass1
{			
			PB_Login_page Lp;
			PB_Mobno_page Mp;
			PBPswPage pw;
			PB_HomePage Hp;
			PbMyacctpage acct;
			PBMyprofilepage PP;
			int TCID;
	
			@Parameters("browsername")
			@BeforeClass
			public void LaunchBrowser(String browsername) throws Throwable
			{
			
				initializebrowser(browsername);
				Lp=new PB_Login_page(driver);
				Mp=new PB_Mobno_page(driver);
				pw=new PBPswPage(driver);
				Hp=new PB_HomePage(driver);
				acct= new PbMyacctpage(driver);
				PP=new PBMyprofilepage(driver);
				
			}
			@BeforeMethod
			public void Login() throws Throwable  
			{
				Lp.ClickPBLoginPageSIgnIn();
				Mp.InputMobnoPBMobnopage();
				Mp.ClickSigninpsw();
				pw.inputPsw();
				pw.ClickSignIn();
				
				
			}
			@Test 
			public void Verify() throws Exception
			{	TCID =121;
			Thread.sleep(3000);
				Hp.DDMyacctPBHomePage();
				Thread.sleep(3000);
				Hp.clickmyprofile();
				Thread.sleep(3000);
				PP.SwitchtoChildWindow();
				PP.ClickPopyp();
				Thread.sleep(3000);
				
				String Actual = acct.getname();
				String Expected =Utilityclass.getTestdata(0,0);
				System.out.println(Expected);
				Assert.assertEquals(Actual, Expected,"falied then display");
				
			}
			@AfterMethod
			public void Logout(ITestResult S1) throws Exception
			{
				System.out.println(S1);
				System.out.println(ITestResult.FAILURE);
				System.out.println(S1.getStatus());
				if(S1.getStatus()==ITestResult.FAILURE)
				{
					Utilityclass.SS(driver, TCID);
				}
			}
}

