package coinyodha;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generics.BaseTest;

public class practice2 extends BaseTest{
	public static String convertToText(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "Jan";
            case 2:
                return "Feb";
            case 3:
                return "Mar";
            case 4:
                return "Apr";
            case 5:
                return "May";
            case 6:
                return "Jun";
            case 7:
                return "Jul";
            case 8:
                return "Aug";
            case 9:
                return "Sep";
            case 10:
                return "Oct";
            case 11:
                return "Nov";
            case 12:
                return "Dec";
            default:
                return null;    // Invalid month number

        }
    }
	public void sheet() throws InterruptedException, AWTException
	{
//		try {
//			if(driver.findElement(By.xpath("//h1[text()='Approved By : ']")).getText()=="Approved By :")
//			{
//				Robot r=new Robot();
//			    r.keyPress(KeyEvent.VK_PAGE_DOWN);
//			}
//			}
//			catch(NoSuchElementException e)
//			{
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]")).sendKeys("2");
		  // Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//tbody/tr[2]/td[1]/input[1]")).sendKeys("3");
		   //Thread.sleep(2000);
		  
		   driver.findElement(By.xpath("//tbody/tr[3]/td[1]/input[1]")).sendKeys("2");
		   //Thread.sleep(2000);
		   driver.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).sendKeys("2");
		   //Thread.sleep(2000);
		   driver.findElement(By.xpath("//tbody/tr[5]/td[1]/input[1]")).sendKeys("2");
		  // Thread.sleep(2000);
		   driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("testing");
		   //Thread.sleep(2000);
		   driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("smoke testing");
		   //Thread.sleep(2000);
		   driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("smoke testing1");
		 //  Thread.sleep(2000);
		   driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).sendKeys("smoke testing2");
		  // Thread.sleep(2000);
		   driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).sendKeys("smoke testing3");
		   //Thread.sleep(3000);
//			}
	}
	
	
	@Test
    public void timeSheets() throws Exception 
	{
        driver.get("https://www.demo.prolegion.com/");
        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("stesting1986+2@gmail.com");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Advait@02");
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
       // Thread.sleep(3000);
        String JobName = "test15sep";
        driver.findElement(By.cssSelector("[class='hover:shadow-md cursor-pointer py-4 items-center rounded-md flex justify-start pl-4']:nth-child(4)")).click();
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//th[.='" + JobName + "']")).click();
        driver.findElement(By.xpath("//th[normalize-space()='stress testing']")).click();
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//span[normalize-space()='Create Timesheet']")).click();
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//span[normalize-space()='+ Create Timesheet']")).click();
        //Thread.sleep(2000);
        String a = driver.findElement(By.cssSelector("[class='h-10 w-[350px] text-white bg-[#2EBAA3] p-1 rounded-md border-0 cursor-pointer text-center outline-0']")).getAttribute("value");
        String current_day, current_month, current_year;
        String b = driver.findElement(By.cssSelector("[class='flex flex-col bg-white p-4 rounded-lg space-y-3'] div:nth-child(4) div:nth-child(2)")).getText();
        String modifiedString = a.replaceAll("th", "").replaceAll(",","");
        String [] j = modifiedString.split(" ");
        String day=j[0].trim();
        current_day=day;
        String month=j[1].trim();
        current_month=month;
        String year=j[2].trim();
        current_year=year;
        String [] jj = b.split(":");
        String[] out = jj[1].trim().split("-");
        String dayF=out[2].trim();
        String monthF=out[1].trim();
        int monthNumber = Integer.parseInt(monthF);
        String monthU= convertToText(monthNumber).trim();
        String yearF=out[0].trim();
        Thread.sleep(2000);
        Boolean chk=true;
        while (chk) 
        {
        	if (day.equals(dayF) && month.equals(monthU) && year.equals(yearF)) {
        		break;
        } else 
        {	
        driver.findElement(By.cssSelector("[data-testId='ChevronLeftIcon']")).click();
      //  Thread.sleep(2000);
        a = driver.findElement(By.cssSelector("[class='h-10 w-[350px] text-white bg-[#2EBAA3] p-1 rounded-md border-0 cursor-pointer text-center outline-0']")).getAttribute("value");
        modifiedString = a.replaceAll("th", "").replaceAll(",", "");
        j = modifiedString.split(" ");
        day = j[0].trim();
        month = j[1].trim();
        year = j[2].trim();
        }
        }
        //Thread.sleep(2000);

        Boolean tst = true;

        while (tst)
        { Thread.sleep(2000);
        sheet();
        Thread.sleep(3000);
        for(;;)
        {
          Robot r=new Robot();
  		  r.keyPress(KeyEvent.VK_PAGE_UP);
  		  Thread.sleep(3000);
  		  driver.findElement(By.cssSelector("[data-testId='ChevronRightIcon']")).click();
		 }
//        if(current_day.equals(day)&&current_month.equals(month)&&current_year.equals(year))
//        {
//        break;
//        }
//    else
//    {
////        driver.findElement(By.cssSelector("[data-testId='ChevronRightIcon']")).click();
////       Thread.sleep(2000);
//        a = driver.findElement(By.cssSelector("[class='h-10 w-[350px] text-white bg-[#2EBAA3] p-1 rounded-md border-0 cursor-pointer text-center outline-0']")).getAttribute("value");
//        modifiedString = a.replaceAll("th", "").replaceAll(",", "");
//        j = modifiedString.split(" ");
//        day = j[0].trim();
//        month = j[1].trim();
//        year = j[2].trim();
//
//    }
}






    }

	

	

}