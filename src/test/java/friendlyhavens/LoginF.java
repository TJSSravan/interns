package friendlyhavens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginF 
{
	public void log(WebDriver driver) throws Exception
	{
		driver.get("https://qa.friendlyhavens.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys("randomguy@yopmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("randomguy");
		driver.findElement(By.xpath("//button[text()='login']")).click();
	}
}
