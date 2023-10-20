package qainterns.interns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class egifts 
{
	@Test
	public void gift() throws Exception
	{
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev.365egifts.com/fe/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("randomguy@yopmail.com");
		driver.findElement(By.xpath("(//input[@placeholder='password'])[1]")).sendKeys("randomguy");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//span[@class='john-txt']")).click();
		driver.findElement(By.xpath("//a[text()='Edit Profile']")).click();
	}
}
