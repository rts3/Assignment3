public class DayDriver {
	/**
	 * H. Write the definitions of the methods to implement the operations for
	 * the class Day, as defined in a through g. DONE ABOVE.
	 * 
	 * I. Write a program to test various operations on the class Day.
	 */
	public static void main(String[] args) {

		System.out.println("Test Program For The Day Class");

		System.out.print("\nInitial day: ");
		Day d = new Day(Day.WEDNESDAY);
		d.print();

		System.out.print("\nNext day: ");
		d.sDay(d.gND());
		d.print();
		
		System.out.print("\nPrevious day: ");
		d.sDay(d.gPD());
		d.print();

		System.out.println("\nUsing getDay() and toString() methods");
		System.out.println("\tDay Index: " + d.gDay());
		System.out.println("\tDay Name: " + d);

		System.out.print("\nAdd 3 days: ");
		d.sDay(d.aD(3));
		d.print();

	}
}
   
