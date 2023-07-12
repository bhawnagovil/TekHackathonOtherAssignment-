package PropertyFileOperationPractice;

import java.io.File;

public class TestPropertyDriver {
    public static void main(String[] args) {
        File path= new File(System.getProperty("user.dir")+"/resources/newdata.properties");
         String value1= PropertyReadWrite.readPropertyFile(path,"USERNAME");
        System.out.println("value Username " + value1);
        String value= PropertyReadWrite.readPropertyFile(path,"URL");
        System.out.println("value URL " + value);
        //PropertyReadWrite.writeDtaPropertyFile(path, "DataBase", "oracle.com");
    }

}
