package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	public static void screenshot(WebDriver driver) throws IOException {
		DateTimeFormatter d=DateTimeFormatter.ofPattern("yyyy-MM-dd HH.mm.ss a");
		LocalDateTime now=LocalDateTime.now();
		System.out.println(d.format(now));
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\user\\Pictures\\seleniumscr\\image"+d.format(now) +".jpg");
		
		FileHandler.copy(src, dest);
	}

	public static void exclesheet() throws EncryptedDocumentException, IOException {
		String path=("E:\\24 july testing batch recording\\study material\\test cases\\Group10_MetroTestCases.xlsx");
		FileInputStream f = new FileInputStream(path);
		String data=WorkbookFactory.create(f).getSheet("MetroTestCases").getRow(5).getCell(6).getStringCellValue();
		System.out.println(data);
	}
}
