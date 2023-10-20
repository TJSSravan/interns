package friendlyhavens;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditGiftRegistry 
{
	@Test
	public void gift() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		LoginF l=new LoginF();
		l.log(driver);
		WebElement ele=driver.findElement(By.xpath("//a[@href='https://qa.friendlyhavens.com/my-gift-registry?user_id=146']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",ele);
		driver.findElement(By.xpath("//a[text()='Add More']")).click();
		driver.findElement(By.xpath("//label[@for='flexCheck3']")).click();
		driver.findElement(By.xpath("//input[@value='21']")).click();
		driver.findElement(By.xpath("//input[@value='24']")).click();
		driver.findElement(By.xpath("//button[text()='Add to register']")).click();
		driver.findElement(By.xpath("//button[text()='Yes, Add it!']")).click();
		driver.quit();
	}
}
