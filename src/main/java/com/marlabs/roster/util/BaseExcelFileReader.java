package com.marlabs.roster.util;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

// This is a Base Class is for reading Excel file.
public abstract class BaseExcelFileReader {
	protected String fileName;
	protected HSSFWorkbook workBook;
	protected HSSFSheet sheet;

	//This method will open Excel file for reading.
	protected POIFSFileSystem openFile() {
		//TODO
		return null;
	}

	//This method will close Excel file.
	protected void closeFile() {
		//TODO
	}
}
