package practice;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import generics.BaseTest;

public class CookiesHandling extends BaseTest
{
	@Test
	public void cookie()
	{
		driver.get("https://qa.coinyodha.com/fe/home");

		//capturing all the cookies from the browser
		Set<Cookie> cookies=driver.manage().getCookies();
		
		//printing the size of cookies 
		System.out.println(cookies.size());
		
		//printing all the cookies names and values
		/*for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+":"+cookie.getValue());
		}*/
		
		//print specific cookie
		System.out.println(driver.manage().getCookieNamed("__insp_nv"));
		
		//Adding new Cookie to the browser
		Cookie c=new Cookie("sneham143","14345444");
		driver.manage().addCookie(c);
		
		cookies=driver.manage().getCookies();
		System.out.println(cookies.size());
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+":"+cookie.getValue());
		}
		
		//deleting specific cookie
		driver.manage().deleteCookieNamed("__insp_nv");
		cookies=driver.manage().getCookies();
		System.out.println(cookies.size());
		
		//deleting all the cookies
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println(cookies.size());
	}
}
