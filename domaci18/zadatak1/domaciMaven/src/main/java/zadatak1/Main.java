package zadatak1;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        FileInputStream inputStream = new FileInputStream("domaci18_1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);
        workbook.createSheet("Sheet2");
        XSSFSheet sheet1 = workbook.getSheetAt(1);
        sheet1.createRow(0);

        double sum = 0;
        double sum1 = 0;
        double sum2 = 0;
        int count = 0;
        int count1 = 0;
        int count2 = 0;


        try {
            for (int i = 0; i < 3; i++) {
                XSSFRow row = sheet.getRow(i);
                for (int o = 0; o < 5; o++) {
                    XSSFCell printData = row.getCell(o);
                    System.out.print(" " + printData.getNumericCellValue());
                }
                System.out.println();
                if (row.getRowNum() == 0) {
                    for (int j = 0; j < 5; j++) {
                        XSSFCell cell = row.getCell(j);

                        double cellValue = cell.getNumericCellValue();
                        sum += cellValue;
                        count++;
                    }
                } else if (row.getRowNum() == 1) {
                    for (int k = 0; k < 5; k++) {
                        XSSFCell cell1 = row.getCell(k);

                        double cellValue = cell1.getNumericCellValue();
                        sum1 += cellValue;
                        count1++;
                    }

                } else {
                    for (int l = 0; l < 5; l++) {
                        XSSFCell cell2 = row.getCell(l);

                        double cellValue = cell2.getNumericCellValue();
                        sum2 += cellValue;
                        count2++;
                    }
                }

            }
            System.out.println();
            System.out.println(sum / count + " " + sum1 / count1 + " " + sum2 / count2);

            sheet1.getRow(0).createCell(0).setCellValue("A1 = " + sum / count);
            sheet1.getRow(0).createCell(1).setCellValue("B1 = " + sum1 / count1);
            sheet1.getRow(0).createCell(2).setCellValue("C1 = " + sum2 / count2);


            FileOutputStream fileOutputStream = new FileOutputStream("domaci18_1.xlsx");
            workbook.write(fileOutputStream);

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        
        workbook.close();
        inputStream.close();

    }
}
