package generic_Library;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities
{
//1.Handling DropDown
	public void dropDown(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
//2.Handling MouseOver
	public void mouseOver(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
//3.Handling DoubleClick
	public void doubleClick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
//4.Handling RightClick
	public void rightClick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	
//5.Handling Drag and Drop
		public void dragdrop(WebDriver driver,WebElement src,WebElement target)
		{
			Actions a=new Actions(driver);
			a.dragAndDrop(src, target).perform();
		}
		
//6.Shifting control to frame
		public void switchFrame(WebDriver driver)
		{
			driver.switchTo().frame(0);
		}
		
//7.Shifting control to Normal WebPage
		public void switchBackFrame(WebDriver driver)
		{
		driver.switchTo().defaultContent();
		}
		
//8.Shifting control to Pop Up
				public void alertPopup(WebDriver driver)
				{
				driver.switchTo().alert().accept();
				}
				
//9.Shifting control to	Child Window
		public void switchingTabs(WebDriver driver)
		{
			Set<String> child = driver.getWindowHandles();
			for (String b:child)
               {
				driver.switchTo().window(b);
               }
		}
		
//10.Handling ScrollBar
		public void scrollbar(WebDriver driver,int x,int y)
		{
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("Widows.scrollBy("+x+","+y+")");
		}
		

}
