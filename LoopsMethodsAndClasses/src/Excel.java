import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.TreeMap;

public class Excel {
    public static void main(String[] args) throws IOException {
        File file = new File("5. Incomes-Report.xlsx");
        try {
            FileInputStream excelFile = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
            XSSFSheet sheet = workbook.getSheet("Incomes");
            TreeMap<String, Double> allOffices = new TreeMap<>();

            double totalIncome = 0;
            XSSFRow currentRow = sheet.getRow(1);

            while (currentRow != null) {
                XSSFCell officeCell = currentRow.getCell(0);
                String currentOffice = officeCell.getStringCellValue();

                XSSFCell incomeCell = currentRow.getCell(5);
                double currentIncome = incomeCell.getNumericCellValue();

                totalIncome += currentIncome;

                if (allOffices.containsKey(currentOffice)) {
                    currentIncome += allOffices.get(currentOffice);
                }

                allOffices.put(currentOffice, currentIncome);
                currentRow = sheet.getRow(1 + currentRow.getRowNum());
            }

            for (String office: allOffices.keySet()) {

                double income = allOffices.get(office);

                String officeFormat = "%s -> %.2f\n";
                System.out.printf(officeFormat, office, income);
            }

            String totalFormat = "Grand Total -> %.2f";
            System.out.printf(totalFormat, totalIncome);

        } catch (FileNotFoundException ex) {
            System.err.println("File not found.");
        }
    }
}
