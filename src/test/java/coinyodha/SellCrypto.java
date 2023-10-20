package coinyodha;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.listeners.IListenersClass;

import generics.BaseTest;
@Listeners(IListenersClass.class)
public class SellCrypto extends BaseTest
{
	@Test
	public void sell() throws Exception
	{
		Login l=new Login();
		l.log(driver);
		driver.findElement(By.xpath("//div[@class=\"btn btn-red click-btn\"]")).click();
		Thread.sleep(3000);
		WebElement sell=driver.findElement(By.xpath("//select[@name=\"selectedCurrency\"]"));
		Select crypto1=new Select(sell);
		crypto1.selectByValue("BTC");
		WebElement slider =driver.findElement(By.xpath("//*[@class='noUi-touch-area']"));
		Dimension sliderSize = slider.getSize();
		int sliderWidth = sliderSize.getWidth();
		int xCoord = slider.getLocation().getX();
		Actions builder = new Actions(driver);
		builder.moveToElement(slider).click().dragAndDropBy(slider,xCoord + sliderWidth, 0).build().perform();
		driver.findElement(By.xpath("//button[text()=' Place Order ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='My Account ']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	}
}
