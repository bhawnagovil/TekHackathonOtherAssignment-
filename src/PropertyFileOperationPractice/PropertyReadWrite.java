package PropertyFileOperationPractice;

import java.io.*;
import java.util.Properties;

        public class PropertyReadWrite {
            public static String readPropertyFile(File path, String key) {
                FileInputStream fis = null;
                Properties pro = null;
                try {
                    fis = new FileInputStream(path);
                    pro = new Properties();
                    pro.load(fis);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String value = pro.getProperty(key);
                return value;
            }

               public static void writeDtaPropertyFile(File path, String key, String value) {
                Properties pro= new Properties();
                pro.setProperty(key, value);
                try {
                    pro.store(new FileOutputStream(path), "updated");
                }
                catch(IOException e){
                    e.printStackTrace();
                }



            }
        }
