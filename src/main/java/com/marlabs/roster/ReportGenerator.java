package com.marlabs.roster;

import com.marlabs.roster.enums.ReportType;
import com.marlabs.roster.service.IArchive;
import com.marlabs.roster.service.IRawFileHandler;
import com.marlabs.roster.service.IReportGenerator;
import com.marlabs.roster.service.impl.AttendanceReport;

public class ReportGenerator {
	private ReportType reportType;
	private IRawFileHandler rawFile;
	private IArchive archiveRawFile;
	private IReportGenerator reportGenerator;

	/**
	 * @param rawFile
	 * @return boolean
	 */
	public boolean createReport(final IRawFileHandler rawFile) {
		IReportGenerator attendanceReport = new AttendanceReport();
		
		attendanceReport.generateReport(rawFile);
		
		return false;
	}
}
