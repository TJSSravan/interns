package practice;

import org.testng.annotations.Test;

public class whitespaces 
{
	@Test
	public void wspace()
	{
		String s="Jogi Sai Sravan";
		String a="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				a=a+s.charAt(i);
			}
		}
		System.out.println(a);
	}
}
