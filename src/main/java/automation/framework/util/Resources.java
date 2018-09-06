package automation.framework.util;

import java.io.File;
import java.io.InputStream;

public class Resources {

	public static File getResourceFile(String filename) {
		return new File(Resources.class.getClassLoader().getResource(".").getFile() + filename);
	}

	public static InputStream getResourceStream(String filename) {
		return Resources.class.getClassLoader().getResourceAsStream(filename);
	}

}
