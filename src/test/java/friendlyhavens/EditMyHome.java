package friendlyhavens;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditMyHome 
{
	@Test
	public void myhome() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		LoginF l=new LoginF();
		l.log(driver);
		WebElement ele=driver.findElement(By.xpath("//a[@href='#editHomeDetails']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ele);
		/*remove bedroom
		driver.findElement(By.xpath("//div[@class='qty qty_counts bedroom_qty']//span//i")).click();*/
		//add bedroom
		driver.findElement(By.xpath("//div[@class='qty qty_counts bedroom_qty']//span[2]//i")).click();
		/*remove bathroom
		driver.findElement(By.xpath("//div[@class='qty qty_counts bathroom_qty']//span//i")).click();*/
		//add bathroom
		driver.findElement(By.xpath("//div[@class='qty qty_counts bathroom_qty']//span[2]//i")).click();
		/*remove bathroom
		driver.findElement(By.xpath("//div[@class='qty qty_counts max_guest_qty']//span//i")).click();*/
		//add bathroom
		driver.findElement(By.xpath("//div[@class='qty qty_counts max_guest_qty']//span[2]//i")).click();
		Thread.sleep(2000);
		WebElement desc=driver.findElement(By.xpath("//textarea[@placeholder='Your description']"));
		desc.click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		desc.sendKeys("Enter the data here for description");
		WebElement ele1=driver.findElement(By.xpath("//input[@value='Save']"));
		jse.executeScript("arguments[0].click();", ele1);
		driver.quit();
	}
}
