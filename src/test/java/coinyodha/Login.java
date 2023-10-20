package coinyodha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
	public void log(WebDriver driver) 
	{
		driver.get("https://qa.coinyodha.com/fe/home");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Log In']")).click();
		driver.findElement(By.xpath("//a[text()='Login As Member']")).click();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("randomguy@yopmail.com");
		driver.findElement(By.xpath("//button[text()=' GET OTP ']")).click();
		WebDriver driver2=new ChromeDriver();
		driver2.get("https://yopmail.com/");
		driver2.findElement(By.xpath("//input[@class='ycptinput']")).sendKeys("randomguy@yopmail.com");
		driver2.findElement(By.xpath("//i[@class=\"material-icons-outlined f36\"]")).click();
		WebElement iframe = driver2.findElement(By.xpath("//iframe[@id='ifmail']"));
		driver2.switchTo().frame(iframe);
		String otp=driver2.findElement(By.xpath("//*[@id=\"mail\"]/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/p[2]")).getText();
		driver2.quit();
		driver.findElement(By.xpath("//input[@name=\"otp\"]")).sendKeys(otp);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
}
