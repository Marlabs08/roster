package com.marlabs.roster.service.impl;

import com.marlabs.roster.service.IArchive;

// This Class would copy processed file into Archive folder
public class ArchiveRawFile implements IArchive {
	private String fileName;

	public boolean archive(Object fileName) {
		// TODO Auto-generated method stub
		return false;
	}

	//This method validates whether if Folder exists.
	private boolean validateFolder() {
		return false;
	}

	//This method creates a folder. 
	private boolean createFolder() {
		return false;
	}

	//This method will generates a file name
	//which is used for renaming file.
	//File format would be YYYYMMDDHHMM
	private String genArchiveFileName() {
		return null;
	}


	//This method would write the file to disk
	private boolean writeFile() {
		return false;
	}

}
