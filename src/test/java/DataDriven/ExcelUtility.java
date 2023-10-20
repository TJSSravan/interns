package DataDriven;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	/**
	 * This is a generic method to fetch Data from excel
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws Exception
	 */
	public String getDataFromExcel(String sheetName,int rowNum,int cellNum) throws Exception 
	{
		FileInputStream fis=new FileInputStream("D:\\SeleniumF\\Data.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetName);
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
		return value;
	}
}
