package com.listeners;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({IListenersClass.class})
public class Testcase1
{
	@Test
	public void hello()
	{
		System.out.println("hello");
	}
	@Test
	public void key()
	{
		System.out.println("Welcome");
		Assert.assertTrue(false);
		System.out.println("Key");
	}
}
