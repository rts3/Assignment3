 
/**
 *
 * @author Ryan Sullivan
 */
public class Day {

	/*
	 * Day Constants
	 */
	 static final int SUNDAY = 0;
	 static final int MONDAY = 1;
	 static final int TUESDAY = 2;
	static final int WEDNESDAY = 3;
	 static final int THURSDAY = 4;
	 static final int FRIDAY = 5;
	 static final int SATURDAY = 6;

	/**
	 * Stores the day of the week
	 */
	private int day;

	/**
	 * A. Set the day.
	 */
	public void sDay(int day) {
		this.day = day;
	}

	/**
	 * B. Print the day
	 */
	public void print() {
		System.out.println(this.toString());
	}

	/**
	 * C. Return the day.
	 */
	public int gDay() {
		return day;
	}

	/**
	 * D. Return the next day.
	 */
	public int gND() {
		return (day + 1) % 7;
	}

	@Override
	public String toString() {
		switch (this.day) {
		case SUNDAY:
			return "Sunday";
		case MONDAY:
			return "Monday";
		case TUESDAY:
			return "Tuesday";
		case WEDNESDAY:
			return "Wednesday";
		case THURSDAY:
			return "Thursday";
		case FRIDAY:
			return "Friday";
		case SATURDAY:
			return "Saturday";
		}
		return "";
	}

	/**
	 * E. Return the previous day.
	 */
	public int gPD() {
		return (day - 1) % 7;
	}

	/**
	 * F. Calculate and return the day by adding certain days to the current
	 * day.
	 */
	public int aD(int days) {
		return (day + days) % 7;
	}

	/**
	 * G. Add the appropriate constructors.
	 */
	public Day() {
		this.day = SUNDAY;
	}

	public Day(int day) {
		this.day = day;
	}
}