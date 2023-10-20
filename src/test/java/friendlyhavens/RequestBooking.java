package friendlyhavens;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RequestBooking 
{
	@Test
	public void booking() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		LoginF l=new LoginF();
		l.log(driver);
		driver.findElement(By.xpath("//a[text()='Friends']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Geeta");
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		driver.findElement(By.xpath("//a[text()='See Profile']")).click();
		WebElement ele=driver.findElement(By.xpath("(//button[text()='I Want To Visit'])[2]"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", ele);
		driver.quit();
	}
}
