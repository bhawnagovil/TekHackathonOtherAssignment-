package xlreadwritePractice;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.File;
import java.io.IOException;

public class TestXLSXDriver {
    public static void main(String[] args)  {
       File path= new File(System.getProperty("user.dir")+"/resources/MayData.xlsx");
       XLSXFileReadWrite.readCellDataFromXLfile(path, "JAN STATUS", 0,0);
       /* XLSXFileReadWrite.readAllDataFromXLfile(path,"MayDataTek" );
        XLSXFileReadWrite.writeXlsxCellData(path, "TekData", 2,0,34);
        XLSXFileReadWrite.writeXLSxCellData(path, "MayDataTek", 2,0, "Rishik");
        XLSXFileReadWrite.createsheetAndAddData(path,"NewTekDta" );*/




    }

}
