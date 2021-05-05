package gmiBank_team22.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

        private static Properties properties;


        static {
            String path = "configuration.properties";
            try {
                //To open a file, we use FileInputStream
                FileInputStream file=new FileInputStream(path);//opening configuration.properties
                properties=new Properties();//We are initializing the properties file
                properties.load(file);//loading the file
                file.close();//closing the file
            } catch (Exception e) {
                //System.out.println("Path is not found");
                e.printStackTrace();
            }
        }

        public static String getProperty(String key){
            return properties.getProperty(key);
        }







}
