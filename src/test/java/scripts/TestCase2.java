package scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generic_Library.BaseClass;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class TestCase2 extends BaseClass
{
	@Test
	public void tc2() throws Throwable
	{
		SkillraryLoginPage slp=new SkillraryLoginPage(driver);
		slp.gearsbutton();
		slp.skillrarydemoapplication();
		
		SkillraryDemoLoginPage sdp=new SkillraryDemoLoginPage(driver);
		utilities.switchingTabs(driver);
		utilities.dropDown(sdp.getcoursedd(),pdata.getProprtydata("coursedd"));
		TestingPage tp=new TestingPage (driver);
		utilities.dragdrop(driver, tp.getseleniumtraining(), tp.getCarttab());
		
		
		}

}
