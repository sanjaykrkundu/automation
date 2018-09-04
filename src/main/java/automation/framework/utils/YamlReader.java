package automation.framework.utils;

import java.io.IOException;
import java.io.InputStream;

import org.yaml.snakeyaml.Yaml;

public class YamlReader {

	public static <T> T read(String fileName, Class<T> classname) {
		Yaml yaml = new Yaml();
		if (!fileName.endsWith(".yaml"))
			fileName = fileName + ".yaml";

		T obj = null;
		try (InputStream in = YamlReader.class.getClassLoader().getResourceAsStream(fileName)) {
			obj = yaml.loadAs(in, classname);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}

}
