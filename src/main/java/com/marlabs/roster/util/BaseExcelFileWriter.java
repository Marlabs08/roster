package com.marlabs.roster.util;

import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public abstract class BaseExcelFileWriter {
	protected String fileName;
	protected HSSFWorkbook workBook;
	protected HSSFSheet sheet;
	protected HSSFRow row;

	//This method will open the Excel File
	protected FileOutputStream openFile() {
		//TODO
		return null;
	}

	//This method will close the Excel File
	protected void closeFile() {
		//TODO
	}
}
