package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadResourceFile {

    public static Properties properties =null;
    public static Properties loadResource() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/test/resource.properties");
        properties = new Properties();
        properties.load(fileInputStream);
        return properties;
    }

    public static String getBrowserFromResourceFile() throws IOException {
        return loadResource().getProperty("browser");
    }

}
