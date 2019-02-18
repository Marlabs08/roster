package com.marlabs.roster.service.impl;

import java.io.FileOutputStream;

import com.marlabs.roster.enums.AttendanceRowHeading;
import com.marlabs.roster.model.AttendanceRowData;
import com.marlabs.roster.service.IRawFileHandler;
import com.marlabs.roster.service.IReportGenerator;
import com.marlabs.roster.util.BaseExcelFileWriter;

public class AttendanceReport extends BaseExcelFileWriter implements
IReportGenerator {
	private AttendanceRowData reportData;
	private AttendanceRowHeading reportHeadingLayout;
	private FileOutputStream excelReportFile;

	private AttendanceRowData loadReportData() {
		// TODO
		return reportData;
	}

	public boolean generateReport(final IRawFileHandler rawFile) {
		// TODO Auto-generated method stub
		return false;
	}

}
