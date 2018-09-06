package automation.framework.util;

import automation.Application;

public class URLSelector {

	public static String getTMSURL() {
		return Application.configuration.getTmsUrls().get(Application.configuration.getEnv().toString().toLowerCase());
	}

	public static String getURL() {
		return Application.configuration.getUrls().get(Application.configuration.getEnv().toString().toLowerCase());
	}

}
