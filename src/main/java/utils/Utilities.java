package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utilities {

    public static final int IMPLICIT_WAIT_TIME = 10;
    public static final String CONFIG_PROPERTY_FILE_PATH =
            "src/test/resources/config/config.properties";
    public static final String EXPECTED_VALUES_PROPERTY_FILE_PATH =
            "src/test/resources/config/expectedValues.properties";

    public static Properties loadPropertyFile(String propertyFilePath){
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(propertyFilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    public static String getPropertyData(String propertyFilePath, String propertyName){
        Properties prop = loadPropertyFile(propertyFilePath);
        return prop.getProperty(propertyName);
    }
}