package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SkillraryCoursesPage 
{
               //Declaration
	//Address of selenium training
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement  seleniumtraining;
	
	//Address of my cart
	@FindBy(id="cartArea")
	private WebElement  carttab;
	
	//Address of facebook
		@FindBy(xpath="(//i[@class='fa fa-facebook'])[2])")
		private WebElement  facebook;
		
		//initialization
		
}
