package coinyodha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.listeners.IListenersClass;

import generics.BaseTest;
@Listeners(IListenersClass.class)
public class TransferCrypto extends BaseTest
{
	@Test
	public void wallet() throws Exception
	{
		Login l=new Login();
		l.log(driver);	
		driver.findElement(By.xpath("//span[text()='Transfer(Crypto)']")).click();
		WebElement element = driver.findElement(By.xpath("//select[@name='selectedCard']"));
		Select s=new Select(element);
		s.selectByValue("BTC");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Random");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Girl");
		driver.findElement(By.xpath("//input[@placeholder='Enter Amount']")).sendKeys("50");
		driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']")).sendKeys("randomgirl@yopmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("833-269-1066");
		driver.findElement(By.xpath("//button[text()='Review your order']")).click();
		driver.findElement(By.xpath("//button[text()='Place your transfer order']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='My Account ']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
		/*driver.findElement(By.xpath("//span[text()='Load Wallet']")).click();
		driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("100");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='paypal-button-logo paypal-button-logo-paypal paypal-button-logo-gold']")).click();
		driver.findElement(By.xpath("//label[text()='Email or mobile number']")).sendKeys("info@365stockgifts.com");
		driver.findElement(By.xpath("//label[text()='Password']")).sendKeys("365stockgifts");
		driver.findElement(By.xpath("//button[@value='Login']")).click();
		driver.findElement(By.xpath("//button[text()='Complete Purchase']")).click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='My Account ']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();*/
	}
}
