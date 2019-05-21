package yanghuadong;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;


/**
 * @Author yanghuadong
 * @DATE 2019/5/21 20:45
 */
public class ReadExcel {

    private static final String EXCEL_NAEM = "C:\\Users\\杨华栋\\Desktop\\退房结算.xlsx";
    private static Workbook workbook;

    public static void main(String[] args) throws IOException {
        workbook = new XSSFWorkbook(new FileInputStream(EXCEL_NAEM));
        Sheet sheet = workbook.getSheetAt(0);
        int rowNumber = sheet.getLastRowNum();
        System.out.println("行数为：" + rowNumber);

        for (int i = 0; i < rowNumber; i++) {
            Row row = sheet.getRow(i);
            int lastColumn = row.getLastCellNum();
            for (int j = 0; j < lastColumn; j++) {
                System.out.print(processCell(row.getCell(j)) + " ");
            }
            System.out.println();
        }
    }

    public static String processCell(Cell cell) {
        switch (cell.getCellTypeEnum()) {
            case NUMERIC:
                return String.valueOf(cell.getNumericCellValue());
            case FORMULA:
               // System.out.println(cell.getCellFormula());
                return String.valueOf(cell.getNumericCellValue());
            default:
                return cell.getStringCellValue();
        }
    }
}
