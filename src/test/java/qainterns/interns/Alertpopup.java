package qainterns.interns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Alertpopup
{
	@Test
	public void alert()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Sai");
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Alert alt=driver.switchTo().alert();
		String text=alt.getText();
		System.out.println(text);
		alt.accept();
		driver.close();
	}
}
