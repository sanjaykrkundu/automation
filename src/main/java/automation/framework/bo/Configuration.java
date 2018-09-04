package automation.framework.bo;

import java.util.Map;

import automation.framework.constant.Browser;
import automation.framework.constant.Environment;
import automation.framework.constant.RunEnv;
import automation.framework.constant.Suite;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Configuration {
	private short threadCount;
	private short retryLimit;
	private Environment env;
	private Suite suite;
	private RunEnv runOn;
	private String hubUrl;
	private Browser browser;
	private short broswerVersion;
	private Map<String, String> urls;
	private Map<String, String> tmsUrls;
	private String credFile;
	private String testFile;
}