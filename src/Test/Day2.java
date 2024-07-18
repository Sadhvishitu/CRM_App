package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	@Test
	public void m2()
	{
		System.out.println("Day2 Class's first method");
	}
	@Test
	public void m3()
	{
		System.out.println("Day2 Class's 2nd method");
	}
	@Test
	public void m4()
	{
		System.out.println("Day2 Class's 3rd method");
	}
	@BeforeTest
	 public void day3s()
	{
		System.out.println("Before Test");
	}
}
