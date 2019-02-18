package com.marlabs.roster.enums;

public enum InOutStatus {

	COLUMN_1("In"),
	COLUMN_2("out");

	private String name;

	InOutStatus(String columnHead) {
		this.name = columnHead;
	}

	public String getName() {
		return name;
	}

}
