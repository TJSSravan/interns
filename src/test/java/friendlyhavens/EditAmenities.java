package friendlyhavens;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditAmenities 
{
	@Test
	public void editA() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		LoginF l=new LoginF();
		l.log(driver);
		WebElement ele= driver.findElement(By.xpath("//a[@href='#editAmenities']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",ele);
		driver.findElement(By.xpath("//input[@value='15']")).click();
		driver.findElement(By.xpath("//button[@name='edit_amenities_submit_btn']")).click();
		driver.quit();
	}
}
