package Utils;

import java.io.File;

public class FilePaths {

    public static String configFilePath = new File("src/main/resources/testData/config.properties").getAbsolutePath();
    public static String errorShotsPath = new File("src/main/resources/errorScreenSoots").getAbsolutePath();
}
