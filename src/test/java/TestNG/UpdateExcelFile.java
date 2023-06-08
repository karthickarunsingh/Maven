package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateExcelFile {
	public static void main(String[] args) throws IOException {
		File excel = new File("C:\\Users\\karth\\eclipse-workspace\\MavenSample\\excelfolder\\excel.xlsx");
		FileInputStream stream = new FileInputStream(excel);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("data");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		String value = c.getStringCellValue();
		if(value.equals("USER NAME")) {
			c.setCellValue("NAME OF USER");
		}
		FileOutputStream o = new FileOutputStream(excel);
		w.write(o);
		System.out.println("work done");
		
		
		
	}

}
