package com.marlabs.roster.enums;

public enum AttendanceRowHeading {

	COLUMN_1("Emp Name"),
	COLUMN_2("Date"),
	COLUMN_3("Day"),
	COLUMN_4("In Time"),
	COLUMN_5("Out Time"),
	COLUMN_6("Logged Hours"),
	COLUMN_7("Attendance"),
	COLUMN_8("Hours Counted");

	private String name;

	AttendanceRowHeading(String columnHead) {
		this.name = columnHead;
	}

	public String getName() {
		return name;
	}

}
