package com.marlabs.roster.service;

public interface IReportGenerator {
	/**
	 * @param rawFile
	 * @return boolean
	 */
	public boolean generateReport(final IRawFileHandler rawFile);
}
