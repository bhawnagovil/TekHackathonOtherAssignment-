package xlreadwritePractice;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class XLSXFileReadWrite {

    public static void readCellDataFromXLfile(File path, String sheetName, int rowNum, int cellNum) {
        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(path);
            System.out.println(workbook.getSheetName(1));
            XSSFSheet sheet = workbook.getSheet(sheetName);
            XSSFRow row = sheet.getRow(rowNum);
            XSSFCell cell = row.getCell(cellNum);
            if (cell.getCellType() == CellType.NUMERIC) {
                System.out.println("data is= " + cell.getNumericCellValue());
            } else if (cell.getCellType() == CellType.STRING) {
                System.out.println("data is= " + cell.getStringCellValue());
            }
            System.out.println("data at the row 2 and cell2 ====" + cell.getStringCellValue());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
        try {
            workbook.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void readAllDataFromXLfile(File path, String sheetName) {
        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(path);
            System.out.println(workbook.getSheetName(1));
            XSSFSheet sheet = workbook.getSheet("sheetName");
            Iterator<Row> rows = sheet.iterator();
            while (rows.hasNext()) {
                Row row = rows.next();
                Iterator<Cell> cells = row.iterator();
                while (cells.hasNext()) {
                    Cell cell = cells.next();
                    if (cell.getCellType() == CellType.NUMERIC) {
                        System.out.print(cell.getNumericCellValue() + " ");
                    } else if (cell.getCellType() == CellType.STRING) {
                        System.out.print(cell.getStringCellValue() + " ");
                    }
                    System.out.println();
                }
                workbook.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }


    }

    public static void readAllDataFromAllXlSheets(File path) {
        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(path);
            Iterator<Sheet> sheets = workbook.iterator();
            while (sheets.hasNext()) {
                Sheet sheet = sheets.next();
                Iterator<Row> rows = sheet.iterator();
                while (rows.hasNext()) {
                    Row row = rows.next();
                    Iterator<Cell> cells = row.iterator();
                    while (cells.hasNext()) {
                        Cell cell = cells.next();
                        if (cell.getCellType() == CellType.NUMERIC) {
                            System.out.print(cell.getNumericCellValue() + " ");
                        } else if (cell.getCellType() == CellType.STRING) {
                            System.out.print(cell.getStringCellValue() + " ");
                        }
                        System.out.println();
                    }
                    workbook.close();
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
    }

    public static void writeXLSxCellData(File path, String sheetName, int row, int column, String data) {

        FileInputStream fs = null;
        //XSSFWorkbook workbook =null;
        FileOutputStream fo = null;
        Workbook workbook = null;
        try {
            fs = new FileInputStream(path);
            workbook = new XSSFWorkbook(fs);
            XSSFSheet sheet = (XSSFSheet) workbook.getSheet("sheetName");
            int sizeOfRow = sheet.getLastRowNum() + 1;
            XSSFRow rowData = sheet.getRow(row);
            int sizeOfCell = rowData.getLastCellNum();
            XSSFCell cell = rowData.getCell(column);
            cell.setCellValue(data);
            fo = new FileOutputStream(path);

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            workbook.write(fo);
            fs.close();
            fo.flush();
            fo.close();
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("completed writing");
    }

    public static void writeXlsxCellData(File path, String sheetName, int row, int column, double data) {
        FileInputStream fs = null;
        //	XSSFWorkbook workbook =null;
        FileOutputStream fo = null;
        Workbook workbook = null;
        try {
            fs = new FileInputStream(path);
            workbook = new XSSFWorkbook(fs);
            XSSFSheet sheet = (XSSFSheet) workbook.getSheet(sheetName);

            XSSFRow rowData = sheet.getRow(row);
            XSSFCell cell = rowData.getCell(column);
            cell.setCellValue(data);
            fo = new FileOutputStream(path);

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            workbook.write(fo);
            fs.close();
            fo.flush();
            fo.close();
            workbook.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
        System.out.println("completed writing");
    }

    public static void createsheetAndAddData(File path,String sheetName) {
        FileInputStream fi=null;
         XSSFWorkbook workbook=null;
        try {
            fi=new FileInputStream(path);
            workbook = new XSSFWorkbook(fi);
        } catch (IOException e) {
            e.printStackTrace();
        }
        XSSFSheet newSheet=workbook.createSheet(sheetName);
        XSSFRow newRow= newSheet.createRow(0);
        XSSFCell cell1= newRow.createCell(0,CellType.STRING);
        XSSFCell cell2=newRow.createCell(1,CellType.NUMERIC);
        //	CellStyle style=cell1.getCellStyle();
        //	cell1.setCellStyle(null);
        cell1.setCellValue("java");
        cell2.setCellValue(9);
        FileOutputStream fo=null;
        try {
            fo = new FileOutputStream(path);
            workbook.write(fo);
            fi.close();
            fo.flush();
            fo.close();
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("completed creating new sheet and added data");



    }



}






