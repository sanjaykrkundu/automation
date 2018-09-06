package automation.framework.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("============================ STARTING TESTCASE ==============================");
		System.out.println(result);
		System.out.println("=============================================================================");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		//System.out.println("--- test success");		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//System.out.println("--- test fail");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		//System.out.println("--- test skip");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		//System.out.println("--- test failed but with success %");
		
	}

	@Override
	public void onStart(ITestContext context) {
		//System.out.println("--- start");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		//System.out.println("--- finish");
		
	}

	

}
