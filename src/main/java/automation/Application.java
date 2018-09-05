package automation;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import automation.framework.bo.Configuration;
import automation.framework.listener.RetryListener;
import automation.framework.util.YamlReader;

public class Application {
	
	public static Configuration configuration;
	

	public static void main(String[] args) {

		configuration = YamlReader.read("configuration.yaml", Configuration.class);
		System.out.println(configuration);

		XmlSuite suite = new XmlSuite();
		suite.setName(configuration.getSuite().toString());
		suite.addListener(RetryListener.class.toString().replaceFirst("class ", ""));
		//suite.addListener(TestListener.class.toString().replaceFirst("class ", ""));
		
		
		XmlTest test = new XmlTest(suite);
		test.setName("TmpTest");
		List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass("automation.testcase.BaseTest"));
		classes.add(new XmlClass("automation.testcase.sanity.TestClass"));
		test.setXmlClasses(classes);

		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);

		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.run();

	}

}
