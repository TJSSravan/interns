package egifts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.listeners.IListenersClass;

import generics.BaseTest;
@Listeners(IListenersClass.class)
public class GiftaFriend extends BaseTest
{
	@Test
	public void giftf() throws Exception
	{
		LoginG l=new LoginG();
		l.log(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='adidas']")).click();
		driver.findElement(By.xpath("//p[text()='Gift a Friend']")).click();
		driver.findElement(By.xpath("//a[text()='25']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Recipient Name']")).sendKeys("randomgirl");
		driver.findElement(By.xpath("//input[@placeholder='Recipient Email']")).sendKeys("randomgirl@yopmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Confirm Recipient Email']")).sendKeys("randomgirl@yopmail.com");
		driver.findElement(By.xpath("//textarea[@placeholder='message']")).sendKeys("Hi Hello Hope you are fine");
		WebElement ele=driver.findElement(By.xpath("(//input[@class=' checked-b-green '])[5]"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", ele);
		WebElement ele1= driver.findElement(By.xpath("//button[@class='btn btn-primary home-btn']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele1);
		Thread.sleep(3000);
	    WebElement ele2=driver.findElement(By.xpath("(//iframe[@role='presentation'])[1]"));
	    driver.switchTo().frame(ele2);
	    driver.findElement(By.xpath("//input[@name='number']")).sendKeys("4242 4242 4242 4242");
        driver.findElement(By.xpath("//input[@id='Field-expiryInput']")).sendKeys("08 / 25");
        driver.findElement(By.xpath("//input[@name='cvc']")).sendKeys("123");
        j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        WebElement statedropdown=driver.findElement(By.xpath("//select[@id='Field-countryInput']"));
        Select state=new Select(statedropdown);
        state.selectByVisibleText("Hungary");
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//button[text()='Pay Now']")).click();
		driver.quit();
	}
}
