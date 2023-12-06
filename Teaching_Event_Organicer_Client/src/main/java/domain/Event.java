package domain;

import java.util.Date;

public abstract class Event {
	private String _id;
	private String _name;
	private Date _date;
	private EventType _type;
	private int _capacity;
	
	public void generatePin() {
		throw new UnsupportedOperationException();
	}
	public void generateQR() {
		throw new UnsupportedOperationException();
	}
	public void registerAttendance() {
		throw new UnsupportedOperationException();
	}
}