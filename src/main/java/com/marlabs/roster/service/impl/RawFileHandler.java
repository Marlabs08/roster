package com.marlabs.roster.service.impl;

import com.marlabs.roster.enums.RawDataHeading;
import com.marlabs.roster.model.RawData;
import com.marlabs.roster.service.IRawFileHandler;
import com.marlabs.roster.util.BaseExcelFileReader;

public class RawFileHandler extends BaseExcelFileReader implements
IRawFileHandler {

	private RawData rawRow;
	private int rowPosition;
	private RawDataHeading rawHeadingLayout;

	//This method will validate the Heading text.
	private boolean validateHeading() {
		// TODO
		return false;
	}

	//This method will compare Heading text with expected text.
	private boolean compareHeading() {
		// TODO
		return false;
	}

	//This method will validate the file contents for its validity.
	public boolean validateFile(String rawFileName) {
		// TODO Auto-generated method stub
		return false;
	}

	//This method will read the Column Header names.
	public RawData getHeaderRow() {
		rowPosition = 1;
		// TODO Auto-generated method stub
		return null;
	}

	//Get the first row, which is after the Header row.
	public RawData getFirstRow() {
		rowPosition = 2;
		// TODO Auto-generated method stub
		return null;
	}

	//Moves to next consecutive row. If end-of-file, then return null.
	public RawData getNextRow() {
		rowPosition ++;
		// TODO Auto-generated method stub
		return null;
	}

}
