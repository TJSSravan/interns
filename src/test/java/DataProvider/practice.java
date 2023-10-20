package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.listeners.IListenersClass;

@Listeners(IListenersClass.class)
public class practice 
{
	@Test(dataProvider="egifts")
	public void log(String username,String password) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev.365egifts.com/fe/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys(username);
		driver.findElement(By.xpath("(//input[@placeholder='password'])[1]")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
	
	@DataProvider(name="egifts")
	public Object passdata()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="randomguy@yopmail.com";
		data[0][1]="randomguy";
		
		data[1][0]="randomgirl@yopmail.com";
		data[1][1]="randomgirl";
		
		return data;
	}
}
