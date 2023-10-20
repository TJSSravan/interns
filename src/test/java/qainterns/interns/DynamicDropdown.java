package qainterns.interns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicDropdown 
{
	@Test
	public void dropdown()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Ind");
		List<WebElement> paths=driver.findElements(By.xpath("//li[@class='ui-menu-item']/div"));
		for (int i=0;i<paths.size();i++) {
			if(paths.get(i).getText().equalsIgnoreCase("India")){
				paths.get(i).click();
				break;
			}}

		
	}
}
