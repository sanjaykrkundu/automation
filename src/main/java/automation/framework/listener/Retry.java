package automation.framework.listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import automation.Application;

public class Retry implements IRetryAnalyzer {
	int counter = 0;

	@Override
	public boolean retry(ITestResult result) {
		if (!result.isSuccess()) {
			if (counter < Application.configuration.getRetryLimit()) {
				counter++;
				result.setStatus(ITestResult.FAILURE);
				return true;
			} else {
				result.setStatus(ITestResult.FAILURE);
			}
		} else {
			result.setStatus(ITestResult.SUCCESS);
		}
		return false;
	}

}
