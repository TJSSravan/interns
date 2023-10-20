package friendlyhavens;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditRecommendations
{
	@Test
	public void editr() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		LoginF l=new LoginF();
		l.log(driver);
		WebElement ele = driver.findElement(By.xpath("//a[@href='#editRecommendation']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",ele);
		WebElement ele1=driver.findElement(By.xpath("//input[@name='restaurants']"));
		ele1.click();
		ele1.sendKeys("Platform65");
		WebElement ele2 = driver.findElement(By.xpath("(//button[@class='btn btn-theme btn-orange me-2'])"));
		jse.executeScript("arguments[0].click();",ele2);
		driver.quit();
	}
}
