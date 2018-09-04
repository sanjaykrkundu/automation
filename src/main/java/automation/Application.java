package automation;

import automation.framework.bo.Configuration;
import automation.framework.utils.YamlReader;

public class Application {

	public static void main(String[] args) {
		
		Configuration configuration = YamlReader.read("configuration.yaml", Configuration.class);
		System.out.println(configuration);

	/*	XmlSuite suite = new XmlSuite();
		suite.setName("TmpSuite");

		XmlTest test = new XmlTest(suite);
		test.setName("TmpTest");
		List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass("automation.irequest.sanity.HomePage"));
		test.setXmlClasses(classes);

		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);

		System.out.println(suite);

		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.run();*/

	}

}
