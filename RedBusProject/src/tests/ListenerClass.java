package tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener{
	
	public void onFinish(ITestContext Result) {
		
		System.out.println(Result.getName()+ " case finished");
	}
	


}
