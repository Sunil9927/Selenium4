package testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCasesGroup {
	@Test(groups = {"smoke","sanity"})
	@Parameters({"user","password"})
	public void test1(String user, String pass)
	{
		System.out.println(user+" "+pass);
		System.out.println("smoke and sanity");
	}
	@Test(groups = {"sanity"})
	public void test2()
	{
		System.out.println(" sanity");
	}
	@Test(groups = {"smoke"})
	public void test3()
	{
		System.out.println("Smoke");
	}
	@Test(groups = {"smoke"})
	public void test4()
	{
		System.out.println("Smoke");
		
	}
}
