package com.marlabs.roster.service;

import com.marlabs.roster.model.RawData;

public interface IRawFileHandler {

	/**
	 * @param rawFileName
	 * @return boolean
	 */
	public boolean validateFile(final String rawFileName);

	/**
	 * @return rawData
	 */
	public RawData getHeaderRow();

	/**
	 * @return rawData
	 */
	public RawData getFirstRow();

	/**
	 * @return rawData
	 */
	public RawData getNextRow();

}
