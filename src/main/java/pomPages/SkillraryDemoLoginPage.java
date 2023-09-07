package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage 
{
//Declaration
	//Address of course element
	@FindBy(id="course")
	private WebElement coursetab;
	
	//Address of selenium training
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtraining;
	
	//Address of dropdown
		@FindBy(name="addresstype")
		private WebElement coursedd;

		//Initialization
		public SkillraryDemoLoginPage (WebDriver driver)
		{
		PageFactory.initElements(driver,this);
		}
		
		//Utilization
		public WebElement getcoursetab()
		{
			return coursetab;
		}
		
		public void seleniumtrainingtab()
		{
			seleniumtraining.click();
		}
		
		public WebElement getcoursedd()
		{
			return coursedd;
		}

}
