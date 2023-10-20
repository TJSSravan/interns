package coinyodha;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.listeners.IListenersClass;

import generics.BaseTest;
@Listeners(IListenersClass.class)
public class Login_Window_handle extends BaseTest
{
	@Test
	public void login() throws Exception
	{
		
		driver.get("https://www.coinyodha.com/fe/home");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		WebElement ele = driver.findElement(By.xpath("//a[text()='Log In']"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).contextClick().build().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		String parentId=driver.getWindowHandle();
		Set<String> allChildIds=driver.getWindowHandles();
		Iterator<String> itr=allChildIds.iterator();
		while(itr.hasNext())
		{
			String ids=itr.next();
			String child=driver.switchTo().window(ids).getTitle();
			if(child.contains(parentId))
			{
				break;
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Login As Member']")).click();
	}
}