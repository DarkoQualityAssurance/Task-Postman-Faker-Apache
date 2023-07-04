package zadatak2;

import com.github.javafaker.Faker;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        try {
        FileInputStream fileInputStream = new FileInputStream("zadatak2.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);
        workbook.createSheet("Sheet2");//kreiranje novog sheeta
        XSSFSheet sheet2 = workbook.getSheetAt(1);


            ArrayList<String> listaimena = new ArrayList<>();
            for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
                XSSFRow row = sheet.getRow(i);
                XSSFCell cell = row.getCell(0);
                String imena = cell.getStringCellValue();
                listaimena.add(imena);
                System.out.println(imena);
            }

            Faker faker = new Faker();
            for (int j = 5; j < 10; j++) {
                String fakeNames = String.valueOf(faker.name().firstName());
                listaimena.add(fakeNames);
            }

            for (int k = 0; k < listaimena.size(); k++) {
                XSSFRow row1 = sheet2.createRow(k);
                sheet2.getRow(k).createCell(0).setCellValue(String.valueOf(listaimena.get(k)));
            }




            FileOutputStream fileOutputStream = new FileOutputStream("zadatak2.xlsx");
            workbook.write(fileOutputStream);

        workbook.close();
        fileOutputStream.close();


        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        }
    }





