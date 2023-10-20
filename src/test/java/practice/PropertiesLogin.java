package practice;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PropertiesLogin 
{
	@Test
	public void data() throws Exception 
	{
		FileInputStream fis=new FileInputStream("D:\\SeleniumF\\egifts.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String Username=pobj.getProperty("username");
		String Password=pobj.getProperty("password");
		String Url=pobj.getProperty("url");
		WebDriver driver=new ChromeDriver();
		driver.get(Url);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys(Username);
		driver.findElement(By.xpath("(//input[@placeholder='password'])[1]")).sendKeys(Password);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
}
