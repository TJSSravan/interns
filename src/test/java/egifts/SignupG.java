package egifts;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generics.BaseTest;

public class SignupG extends BaseTest
{
	@Test
	public void sign() throws Exception
	{
		driver.get("https://dev.365egifts.com/fe/");
		driver.findElement(By.xpath("(//span[text()='Sign Up'])[1]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='First name'])[1]")).sendKeys("random");
		driver.findElement(By.xpath("(//input[@placeholder='Last name'])[1]")).sendKeys("guy");
		Random r=new Random();
		int random=r.nextInt(50);
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("randomguy"+random+"@yopmail.com");
		Thread.sleep(3000);
		Robot ro=new Robot();
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_A);
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_C);
		ro.keyPress(KeyEvent.VK_CONTROL);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("randomguy");
		driver.findElement(By.xpath("(//input[@class='form-check-input'])[1]")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		WebDriver driver2=new ChromeDriver();
		driver2.get("https://yopmail.com/");
		driver2.findElement(By.xpath("//input[@placeholder='Enter your inbox here']")).click();
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_V);
		driver2.findElement(By.xpath("//i[@class=\"material-icons-outlined f36\"]")).click();
		WebElement iframe = driver2.findElement(By.xpath("//iframe[@id='ifmail']"));
		driver2.switchTo().frame(iframe);
		String otp=driver2.findElement(By.xpath("//main[@class='yscrollbar']//div//div//div//table//tbody//tr//td[2]//div//table//tbody//tr[2]//tr//td//p//b")).getText();
		driver2.quit();
	}
}
