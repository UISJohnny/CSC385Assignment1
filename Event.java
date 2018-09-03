
public class Event {
	Date date;
	int start;
	int end;
	String description; 
	
	public Event (Date date, int start, int end, String description) throws IllegalArgumentException {
		this.date = date;
		if(start <= end) {
			throw new IllegalArgumentException("invalid start end time");
		}
		else {
			this.start=start;
			this.end = end;
		}
		this.description=description;	
	}
	public Date getDate() {
		return this.date;
	}
	public int getStart() {
		return this.start;
	}
	public int getEnd() {
		return this.end;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String newDescription) {
		this.description = newDescription;
	}
	public String toString() {
		return ""+date.toString()+ " "+this.start+" - "+this.end+": "+this.description;
	}
	public boolean equals(Object obj) {
		Event otherEvent = (Event)obj;
		if(this.date.equals(otherEvent.getDate()) && this.start == otherEvent.getStart() && this.end == otherEvent.getEnd() && this.description.equals(otherEvent.getDescription()) ) {
			return true;
		}
		return false;
	}
}
