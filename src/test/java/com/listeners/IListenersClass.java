package com.listeners;



import org.testng.ITestListener;
import org.testng.ITestResult;

import generics.BaseTest;


public class IListenersClass extends BaseTest implements ITestListener
{
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCase Sucess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("failure");
		try {
			failed(result.getMethod().getMethodName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
