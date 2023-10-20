package qainterns.interns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkboxes 
{
	@Test
	
	public void checkbox() throws InterruptedException
	{
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		driver.findElement(By.xpath("//input[@value='option2']")).click();
		driver.findElement(By.xpath("//input[@value='option3']")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
