package friendlyhavens;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ConfirmedBooking 
{
	@Test
	public void book() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		LoginF l=new LoginF();
		l.log(driver);
		WebElement ele=driver.findElement(By.xpath("//a[text()='My Bookings']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ele);
		driver.findElement(By.xpath("//a[text()='Confirmed Booking']")).click();
		driver.quit();
	}
}
