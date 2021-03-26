package TM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class MiFactory {

    public static Object getInstance(String objName) {
        try{
            Properties properties= new Properties();
            properties.load(new FileInputStream(new File("MiFactory.properties")));

            String name = properties.getProperty(objName);
            Object obj = Class.forName(name).newInstance();
            return obj;

        }catch(Exception ex){}
        return null;
    }
}
