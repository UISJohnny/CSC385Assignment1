
public class Calendar {
	static final int MAXEVENTS=4;
	Event[] events;
	int numEvents;
	
	public Calendar () {
		this.events = new Event[MAXEVENTS];
		this.numEvents=0;
	}
	public boolean addEvent(Event e) {
		if(this.numEvents < MAXEVENTS ) {
			this.events[numEvents] = e;
			return true;
		}
		return false;
	}
	public int findEvent(Event e) {
		for(int i=0; i < MAXEVENTS; i++) {
			if(e.equals(events[i])) {
				return i;
			}
		}
		return -1;
	}
	public boolean removeEvent(Event e) {
		if( this.findEvent(e) != -1) {
			this.events[this.findEvent(e)] = null;
			return true;
		}
		return false;
	}
	public void dump() {
		for(int i=0; i < MAXEVENTS; i++) {
			if(this.events[i] != null) {
				System.out.println( this.events[i].toString());
			}
		}
	}
}
