package resources.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Application {
    
    public static String getKey(String key) throws IOException{
        Properties prop = new Properties();

        InputStream file = new FileInputStream("application.properties");
        prop.load(file);
        
        return prop.getProperty(key);
    }
}
