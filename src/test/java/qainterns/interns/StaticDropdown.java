package qainterns.interns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class StaticDropdown
{
	@Test
	public void dropdown() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement element= driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));
		element.click();
		Select s=new Select(element);
		s.selectByValue("option2");
		driver.close();
	}
}
