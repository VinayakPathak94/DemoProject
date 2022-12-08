import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataFetch {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myfile = new File("G:\\Vinayak\\Manual Lecture\\Selenium.xlsx");
		
		FileInputStream myexcel = new FileInputStream(myfile);
		
		String firstrow = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(firstrow);
	}

}