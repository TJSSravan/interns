package practice;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Arraylist 
{
	@Test
	public void lists()
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("sravan");
		a.add("sai");
		a.add("jogi");
		System.out.println(a);
	}
}
