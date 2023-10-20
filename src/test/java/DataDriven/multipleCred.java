package DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class multipleCred
{
	@Test
	public void credentials() throws Exception
	{
		for(int i=1;i<=2;i++)
		{
		WebDriver driver=new ChromeDriver();
		ExcelUtility eu=new ExcelUtility();
		String mail=eu.getDataFromExcel("Sheet5", i, 1);
		String password=eu.getDataFromExcel("Sheet5", i, 2);
		driver.get("https://dev.365egifts.com/fe/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys(mail);
		driver.findElement(By.xpath("(//input[@placeholder='password'])[1]")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(3000);
		driver.quit();
		}
	}
}
