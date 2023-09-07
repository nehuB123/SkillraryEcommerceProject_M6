package generic_Library;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.ITestResult;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
   public WebDriver driver;
   public  Property_File pdata=new Property_File();
   public WebDriverUtilities utilities=new WebDriverUtilities();
   @BeforeMethod
   public void openApp() throws IOException
   {
	   WebDriverManager.edgedriver().setup();
	   driver=new EdgeDriver();
	   driver.manage().window().maximize();
	   driver.get(pdata.getProprtydata("url"));
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }
   @AfterMethod
   public void closeApp(ITestResult res) throws Throwable
   {
	   int status=res.getStatus();
	   String name=res.getName();
	   if(status==2)
	   {
		   Photo p=new Photo();
		   p.getPhoto(driver, name);
	   }
	   driver.quit();
   }
   
}
   

