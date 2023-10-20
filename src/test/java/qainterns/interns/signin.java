package qainterns.interns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class signin {
	@Test
public void geeta() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://qa.friendlyhavens.com/");
	driver.findElement(By.xpath("//button[text()='JOIN NOW']")).click();
	//WebElement addprofile = driver.findElement(By.xpath("//p[@class='mb-0 required']"));
	//addprofile.click();
	//addprofile.sendKeys("\"C:\\Users\\DELL\\OneDrive\\Pictures\\Screenshots\\2021-06-02 (7).png\"");
	//frame.sendKeys("C:\\Users\\vighn\\OneDrive\\Pictures\\Screenshots[5].png");
	driver.findElement(By.id("first_name")).sendKeys("shweta");
	driver.findElement(By.id("last_name")).sendKeys("haven");
	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rex124@yopmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rex124");
	driver.findElement(By.xpath("//input[@placeholder='Confirm password']")).sendKeys("rex124");
	driver.findElement(By.cssSelector("input[placeholder='I Live in (City)']")).sendKeys("gadag");
	WebElement ele=driver.findElement(By.xpath("//select[@name='live_in_country']"));
	Select dropdown=new Select(ele);
	dropdown.selectByValue("4");
    WebElement ele2=driver.findElement(By.name("next"));
    ele2.click();
    driver.findElement(By.xpath("(//i[text()='add'])[1]")).click();
    driver.findElement(By.xpath("(//span//i[text()='remove'])[2]")).click();
   driver.findElement(By.xpath("(//div//i[text()='add'])[3]")).click();
   WebElement monthdropdown = driver.findElement(By.cssSelector("select[class='form-control availability_months_select']"));
	Select month=new Select(monthdropdown);
	month.selectByVisibleText("Mar.");
	WebElement yeardropdown = driver.findElement(By.xpath("//select[@class='form-control availability_years_select']"));
	Select year=new Select(yeardropdown);
	year.selectByVisibleText("2023");
	WebElement addphoto = driver.findElement(By.xpath("//button[@class='btn-add-photos']"));
	addphoto.click();
	driver.findElement(By.name("home_image_1")).sendKeys("C:\\Users\\vighn\\OneDrive\\Pictures\\Screenshots\\Screenshot (5).png");
	driver.findElement(By.name("home_image_2")).sendKeys("C:\\Users\\vighn\\OneDrive\\Pictures\\Screenshots\\Screenshot (11).png");
	driver.findElement(By.name("home_image_3")).sendKeys("C:\\Users\\vighn\\OneDrive\\Pictures\\Screenshots\\Screenshot (6).png");
	driver.findElement(By.name("home_image_4")).sendKeys("C:\\Users\\vighn\\OneDrive\\Pictures\\Screenshots\\Screenshot (11).png");
	driver.findElement(By.name("home_image_5")).sendKeys("C:\\Users\\vighn\\OneDrive\\Pictures\\Screenshots\\Screenshot (5).png");
	WebElement ele3=driver.findElement(By.xpath("//button[text()='Okay']"));
	ele3.click();
	
	
	//ChromeDriver driver2=new ChromeDriver();
	//driver2.navigate().to("https://yopmail.com/en/");
	//driver2.findElement(By.xpath("//input[@class='ycptinput']")).sendKeys("rex124@yopmail.com\"");*/
}

}
