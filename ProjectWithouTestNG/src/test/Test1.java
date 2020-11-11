package test;

import org.testng.annotations.Test;
@Test(groups = {"Regression"})
public class Test1 {

	@Test(groups = {"Regression"})
	public void test1() {
		System.out.println("Inside my testcase1");
	}
	
	@Test(groups = {"Sanity"})
	public void test10() {
		System.out.println("Inside my testcase10");
	}
	
	@Test(groups = {"Regression"})
	public void test11() {
		System.out.println("Inside my testcase11");
	}
	
	@Test(groups = {"Sanity"})
	public void test12() {
		System.out.println("Inside my testcase12");
	}
}
