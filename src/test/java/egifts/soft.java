package egifts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft 
{
	@Test
	public void hard() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 SoftAssert sa=new SoftAssert();
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[1]/input"));
         ele.click();
         sa.assertFalse(ele.isSelected());
        Thread.sleep(3000);
         WebElement ele2=driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input"));
         ele2.click();
         Assert.assertTrue(ele2.isSelected());
         sa.assertAll();
	}
}
