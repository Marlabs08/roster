package com.marlabs.roster.enums;

public enum RawDataHeading {

	COLUMN_1("Date"),
	COLUMN_2("Time"),
	COLUMN_3("Empid"),
	COLUMN_4("EmpName"),
	COLUMN_5("Department"),
	COLUMN_6("Gate"),
	COLUMN_7("InOut"),
	COLUMN_8("Location"),
	COLUMN_9("Remark");

	private String name;

	RawDataHeading(String columnHead) {
		this.name = columnHead;
	}

	public String getName() {
		return name;
	}
}
