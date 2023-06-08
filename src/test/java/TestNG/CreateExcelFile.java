package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelFile {
	public static void main(String[] args) throws IOException {
		File excel = new File("C:\\Users\\karth\\eclipse-workspace\\MavenSample\\excelfolder\\excel.xlsx");
		FileInputStream stream = new FileInputStream(excel);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.createSheet("singh");
		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("java");
		FileOutputStream o = new FileOutputStream(excel);
		w.write(o);
		System.out.println("check excel sheet");
		
		
	}

}
