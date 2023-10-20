package egifts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 
{
	@Test
	public void sample1() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		LoginG l=new LoginG();
		l.log(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='adidas']")).click();
	}
	@Test
	public void sample2() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		LoginG l=new LoginG();
		l.log(driver);
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement element=driver.findElement(By.xpath("(//span[text()='Prezzee'])[1]"));
		jse.executeScript("arguments[0].click()",element);
	}
}
