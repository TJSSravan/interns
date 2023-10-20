package egifts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DataDriven.ExcelUtility;

public class LoginG 
{
	public void log(WebDriver driver) throws Exception
	{
		ExcelUtility eu=new ExcelUtility();
		String mail=eu.getDataFromExcel("Sheet5", 1, 1);
		String password=eu.getDataFromExcel("Sheet5", 1, 2);
		driver.get("https://dev.365egifts.com/fe/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys(mail);
		driver.findElement(By.xpath("(//input[@placeholder='password'])[1]")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
}
