package practice;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import generics.BaseTest;

public class multiplewindows extends BaseTest
{
	@Test
	public void window() throws Exception
	{
		driver.get("https://www.flipkart.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.open()");
		ArrayList<String> tab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("sai");
		Thread.sleep(3000);
		driver.switchTo().window(tab.get(0));
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9704465325");
	}
}
/*Iterator<String> itr=handles.iterator();
while(itr.hasNext())
{
	String ids=itr.next();
	String child=driver.switchTo().window(ids).getTitle();
	if(child.contains(parentId))
	{
		break;
	}
}*/