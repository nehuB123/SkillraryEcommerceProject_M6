package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage 
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


               //Initialization
		public TestingPage(WebDriver driver)
		{
		PageFactory.initElements(driver,this);
		}


		            //Utilization
		public WebElement getseleniumtraining()
		{
			return seleniumtraining;
			
		}
		
		public WebElement getCarttab() 
		{
			return carttab;
		}
		
		
		public void facebookicon() 
		{
			facebook.click();;
		}
		
}


