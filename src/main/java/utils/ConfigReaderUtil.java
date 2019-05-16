package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReaderUtil {

    private String url;
    private String chromeDriverPath;
    private String phantomDriverPath;
    private String firefoxDriverPath;

    public ConfigReaderUtil() {
        Properties prop = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("src/main/resources/config.properties");
            // load a properties file
            prop.load(input);
            // get the property value and print it out
            this.url = prop.getProperty("url");
            this.chromeDriverPath = prop.getProperty("chrome_driver_path");
            this.phantomDriverPath = prop.getProperty("phantom_driver_path");
            this.firefoxDriverPath = prop.getProperty("firefox_driver_path");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String getUrl() {
        return this.url;
    }

    public String getChromeDriverPath() {
        return this.chromeDriverPath;
    }

    public String getPhantomDriverPath() {
        return this.phantomDriverPath;
    }

    public String getFirefoxDriverPath() {
        return this.firefoxDriverPath;
    }

}