package egifts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class GiftYourself
{
	@Test
	public void gift() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		LoginG l=new LoginG();
		l.log(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='crd-cntnt'])[5]")).click();
		driver.findElement(By.xpath("//p[text()='Gift a Friend']")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[11]/div/div/div/div[2]/div/form/div[1]/div/a[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Recipient Name']")).sendKeys("akshay");
		driver.findElement(By.xpath("//input[@placeholder='Recipient Email']")).sendKeys("akshay123@yopmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Confirm Recipient Email']")).sendKeys("akshay123@yopmail.com");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[11]/div/div/div/div[2]/div/form/textarea")).sendKeys("happy birthday");
		WebElement ele1 = driver.findElement(By.xpath("(//*[@id=\"db2086b5-b7ca-4b91-ac63-03a00e7dcc26\"])[1]"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", ele1);
		WebElement ele=driver.findElement(By.xpath("//button[text()='Confirm']"));
		Thread.sleep(3000);
	    j.executeScript("arguments[0].click();", ele);
	    Thread.sleep(3000);
	    WebElement ele2=driver.findElement(By.xpath("(//iframe[@role='presentation'])[1]"));
	    driver.switchTo().frame(ele2);
	    driver.findElement(By.xpath("//input[@name='number']")).sendKeys("4242 4242 4242 4242");
        driver.findElement(By.xpath("//input[@id='Field-expiryInput']")).sendKeys("08 / 25");
        driver.findElement(By.xpath("//input[@name='cvc']")).sendKeys("123");
        Thread.sleep(3000);
        WebElement statedropdown=driver.findElement(By.xpath("//select[@id='Field-countryInput']"));
        Select state=new Select(statedropdown);
        state.selectByVisibleText("Hungary");
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//button[text()='Pay Now']")).click();
	}
}
