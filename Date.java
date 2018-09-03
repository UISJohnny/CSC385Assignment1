public class Date implements Comparable<Date> {
	int year = 2014; //2014-2020
	int month = 1; //1-12
	int day = 1; //1-31
			
	public Date(int year, int month, int day) throws IllegalArgumentException {
		if(year>=2014 && year<=2020) {
			this.year = year;
		}
		else {
			throw new IllegalArgumentException("Invalid year!");
		}
		if(month>=1&&month<=12) {
			this.month = month;
		}
		else {
			throw new IllegalArgumentException("Invalid month!");
		}
		if(day >= 1 && day <= 31) {
			this.day = day;
		}
		else {
			throw new IllegalArgumentException("Invalid day!");
		}
	}
	public int getYear() {
		return this.year;
	}
	public int getMonth() {
		return this.month;
	}
	public int getDay() {
		return this.day;
	}
	public String toString() {
		return this.month+"/"+this.day+"/"+this.year;
	}
	public boolean equals (Object obj) {
		Date otherDate = (Date)obj;
		if(this.getYear() == otherDate.getYear() && this.getMonth() == otherDate.getMonth() && this.getDay() == otherDate.getDay() ) {
			return true;
		}
		return false;
		
	}
	public int compareTo(Date otherDate) {
		if(this.equals(otherDate)) {
			return 0;
		}
		if(this.getYear() > otherDate.getYear())
		{
			return 1;
		}
		else if (this.getYear() < otherDate.getYear()) { 
			return -1;
		}
		
		if (this.getMonth() > otherDate.getMonth()) {
			return 1;
		}
		else if(this.getMonth() > otherDate.getMonth()) {
			return -1;
		}
		
		if(this.getDay() > otherDate.getDay()) {
			return -1;
		}
		else if(this.getDay() < otherDate.getDay()) {
			return 1;
		}
		return 2; //Error
	}
}
