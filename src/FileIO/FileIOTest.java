package FileIO;

import java.io.*;

//C:\Intel\JavaJala\TekJavaTraining\resources\data.txt
public class FileIOTest {
    public void readDataFromFileUsingInputStream(){
       File file= new File("C:\\Intel\\JavaJala\\TekJavaTraining\\resources\\data.txt");
        FileInputStream fis = null;
        try {
             fis= new FileInputStream(file);
            int ch=-1;
            while((ch=fis.read())!=-1){
                System.out.print((char)ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        try{
        fis.close();}
        catch(IOException e){
            e. printStackTrace();
        }

    }

    public void readDataFromFileUsingReader(){
        String s= System.getProperty("user.dir");
        System.out.println("path "+ s);
        File file = new File(s + "/resources/data.txt");
        FileReader reader= null;
        int ch = 0;
        try {
            reader = new FileReader(file);
            while ((ch = reader.read()) != -1) {
                System.out.print((char)ch);
            }
        }
            catch(IOException e){
                e.printStackTrace();
            }

        try {
            reader.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
    public void writeDataUsingFileOutputStream(){
        String s= System.getProperty("user.dir");
        File file = new File(s+ "/resources/data1.txt");

        FileOutputStream fos= null;
        try {
            fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }
        String output= "Prpgramming is important to learn";
        char[] chararray= output.toCharArray();
        try {
            for (char c : chararray) {
                fos.write(c);
            }
        }
        catch(IOException e){
            e.printStackTrace();
            }
        try {
            fos.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public void writeDatausingOutPutReaderStream() {
        String s = System.getProperty("user.dir");
        File file = new File(s + "/resources/data1.txt");
        try {
            FileWriter fw = null;
            try {
                fw = new FileWriter(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fw.write("Programming is important to learn");
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        } finally {
            System.out.println("action completed");
        }
    }




    public static void main(String[] args) {
        FileIOTest i= new FileIOTest();
        //i.readDataFromFileUsingInputStream();
        i.readDataFromFileUsingReader();
        i.writeDataUsingFileOutputStream();
        i.writeDatausingOutPutReaderStream();
    }
}
