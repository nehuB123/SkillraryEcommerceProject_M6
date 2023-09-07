package scripts;

import org.testng.annotations.Test;

import generic_Library.BaseClass;
import pomPages.AddToCartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass 
{
	@Test
	public void tc1()
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		utilities.switchingTabs(driver);
		
		SkillraryDemoLoginPage sdl=new SkillraryDemoLoginPage (driver);
		utilities.mouseOver(driver,sdl.getcoursetab());
		sdl.seleniumtrainingtab();
		
		AddToCartPage atp=new AddToCartPage(driver);
		utilities.doubleClick(driver,atp.getAddbtn());
		atp.addtocartbtn();
		
		utilities.alertPopup(driver);
	}


}
