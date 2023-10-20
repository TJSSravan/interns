package coinyodha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class imanage 
{
	@Test
	public void manage() throws InterruptedException
	{
		WebDriver d = new ChromeDriver();
		d.get("https://cloudimanage.com/auth?auto_submit=false&remember_email=false#/login");
		d.manage().window().maximize();
		 @SuppressWarnings("deprecation")
	 WebDriverWait wait=new WebDriverWait(d, 10);
		 d.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
		d.findElement(By.xpath("/html/body/im-app/im-login/im-layout/section/section/section[1]/im-content/form/im-email/section/input")).sendKeys("prudhvi.vu@rpostlabs.com");
		d.findElement(By.xpath("/html/body/im-app/im-login/im-layout/section/section/section[1]/im-content/form/button")).click();
		wait.until(ExpectedConditions.visibilityOf(d.findElement(By.className("password-container"))));
		d.findElement(By.xpath("/html/body/im-app/im-login/im-layout/section/section/section[1]/im-content/form/im-password/section/div/input")).sendKeys("CharanV@2001");

		d.findElement(By.xpath("/html/body/im-app/im-login/im-layout/section/section/section[1]/im-content/form/button")).click();
		d.findElement(By.xpath("//*[@id=\"ws-tree-panel\"]/im-tree/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[6]/div/tree-node-wrapper/div/tree-node-expander/span")).click();
		d.findElement(By.xpath("//*[@id=\"ws-tree-panel\"]/im-tree/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[6]/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/tree-node-expander/span")).click();
		d.findElement(By.xpath("//*[@id=\"ws-tree-panel\"]/im-tree/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[6]/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/tree-node-expander/span")).click();
		d.findElement(By.xpath("//*[@id=\"ACTIVE!408_ACTIVE!406_ACTIVE!405_my-matters\"]")).click();

		d.findElement(By.xpath("//*[@id=\"ws-row-ACTIVE!1668.1\"]/span/div/div")).click();

		d.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/ws-toolbar/div/div[2]/button[12]/i/img")).click();
	Thread.sleep(10000);
		d.getWindowHandles().forEach(tab->d.switchTo().window(tab));
		d.findElement(By.xpath("//*[@id=\"login-email\"]")).sendKeys("prudhvi.vu@rpostlabs.com");
		d.findElement(By.xpath("//*[@id=\"btnEmailNext\"]")).click();
		d.findElement(By.xpath("//*[@id=\"password-login\"]")).sendKeys("PrudhviCharan@2001");
		d.findElement(By.xpath("//*[@id=\"btnEmailLogin\"]")).click();
		/*for(int i=1;i<100;i++) {
			WebElement w=d.findElement(By.id("AddSigner"));
			JavascriptExecutor jse = (JavascriptExecutor)d;
			jse.executeScript("arguments[0].click();",w);
			d.findElement(By.xpath("(//*[@class='nopadding'][4])["+i+"]/span/input")).sendKeys("prudhvi");
			d.findElement(By.xpath("(//*[@class='nopadding'][5])["+i+"]/span/input")).sendKeys("prudhvi"+i+"@mailnator.com");
		}*/
		WebElement w=d.findElement(By.id("AddSigner"));
		JavascriptExecutor jse = (JavascriptExecutor)d;
		jse.executeScript("arguments[0].click();",w);
		d.findElement(By.xpath("(//*[@class='nopadding'][4])[1]/span/input")).sendKeys("prudhvi");
		d.findElement(By.xpath("(//*[@class='nopadding'][5])[1]/span/input")).sendKeys("prudhvicharanv@yahoo.com");
		d.findElement(By.xpath("//*[@id='MessageSubject']")).sendKeys("send document");
		d.switchTo().frame(0);
		d.findElement(By.xpath("/html/body")).sendKeys("hi");
		d.switchTo().defaultContent();
		d.findElement(By.xpath("//*[@id='btnNext']")).click();
		Thread.sleep(2000);
		WebElement sign=d.findElement(By.xpath("(//a[@id='sign'])[2]"));
		WebElement page=d.findElement(By.xpath("//*[@id='1']"));
		System.out.println(sign.getLocation());
	Actions a=new Actions(d);
	//WebElement q=d.findElement(By.xpath("//*[@class='tooltip-inner']"));
	Thread.sleep(2000);

	//a.moveToElement(sign).doubleClick().dragAndDropBy(page, 200, 200).build().perform();
	a.moveToElement(sign).doubleClick().build().perform();
	Thread.sleep(2000);

	a.clickAndHold().build().perform();
	}
}
