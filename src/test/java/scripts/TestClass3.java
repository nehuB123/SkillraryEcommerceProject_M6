package scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generic_Library.BaseClass;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class TestClass3 extends BaseClass
{
	@Test
	public void tc3() 
	{
		SkillraryLoginPage slp=new SkillraryLoginPage(driver);
		slp.gearsbutton();
		slp.skillrarydemoapplication();
		
		SkillraryDemoLoginPage sdp=new SkillraryDemoLoginPage (driver);
		utilities.switchFrame( driver);
		
		TestingPage tp=new TestingPage(driver);
		utilities.dragdrop(driver,tp.getseleniumtraining() , tp.getCarttab());
		
		
		
		
		
		
	}

}
