package com.marlabs.roster.model;

public class AttendanceRowData {
	private String empName;
	private int date;
	private String day;
	private String inTime;
	private String outTime;
	private String loggedHours;
	private String attendance;
	private int hoursCounted;

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName
	 *            the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the date
	 */
	public int getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(int date) {
		this.date = date;
	}

	/**
	 * @return the day
	 */
	public String getDay() {
		return day;
	}

	/**
	 * @param day
	 *            the day to set
	 */
	public void setDay(String day) {
		this.day = day;
	}

	/**
	 * @return the inTime
	 */
	public String getInTime() {
		return inTime;
	}

	/**
	 * @param inTime
	 *            the inTime to set
	 */
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	/**
	 * @return the outTime
	 */
	public String getOutTime() {
		return outTime;
	}

	/**
	 * @param outTime
	 *            the outTime to set
	 */
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	/**
	 * @return the loggedHours
	 */
	public String getLoggedHours() {
		return loggedHours;
	}

	/**
	 * @param loggedHours
	 *            the loggedHours to set
	 */
	public void setLoggedHours(String loggedHours) {
		this.loggedHours = loggedHours;
	}

	/**
	 * @return the attendance
	 */
	public String getAttendance() {
		return attendance;
	}

	/**
	 * @param attendance
	 *            the attendance to set
	 */
	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}

	/**
	 * @return the hoursCounted
	 */
	public int getHoursCounted() {
		return hoursCounted;
	}

	/**
	 * @param hoursCounted
	 *            the hoursCounted to set
	 */
	public void setHoursCounted(int hoursCounted) {
		this.hoursCounted = hoursCounted;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AttendanceRowData [empName=" + empName + ", date=" + date
				+ ", day=" + day + ", inTime=" + inTime + ", outTime="
				+ outTime + ", loggedHours=" + loggedHours + ", attendance="
				+ attendance + ", hoursCounted=" + hoursCounted + "]";
	}

}
