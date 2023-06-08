package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException {
		File excelLoc = new File("C:\\Users\\karth\\eclipse-workspace\\MavenSample\\excelfolder\\excel.xlsx");
		
		FileInputStream stream = new FileInputStream(excelLoc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("data");
		
		
		for (int k = 0; k < s.getPhysicalNumberOfRows(); k++) {
			Row r = s.getRow(k);
			
			for (int l = 0; l < r.getPhysicalNumberOfCells(); l++) {
				Cell c = r.getCell(l);
				System.out.print(c);
				
				int type = c.getCellType();
				System.out.println(type);
				
				//type - 0 = numeric value
				//type - 1 = string value
				
				if(type==0) {
					double d = c.getNumericCellValue();
					long ll =(long)d;
					System.out.println(ll);
				}
				
				
					
				}
				
				
			}
			
			
		
}

}
