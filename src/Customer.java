import java.util.Enumeration;
import java.util.Vector;

class Customer {
	private String name;
	private Vector<Rental> rentals = new Vector<Rental>();

	public Customer(String newname) {
		name = newname;
	}

	public void addRental(Rental arg) {
		rentals.addElement(arg);
	}

	public String getName() {
		return name;
	}

	public String statement() {
		Enumeration<Rental> enum_rentals = rentals.elements();
		String result = "Rental Record for " + this.getName() + "\n";
		result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

		while (enum_rentals.hasMoreElements()) {
			Rental each = enum_rentals.nextElement();
			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t" + "\t" + each.getDaysRented() + "\t" + String.valueOf(each.getCharge()) + "\n";
		}
		// add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenderPoints()) + " frequent renter points";
		return result;
	}

	public String htmlStatement() {
		Enumeration<Rental> enum_rentals = rentals.elements();
		String result = "<Hl>Rentals for <EM>" + getName() + "</EM></Hl><P>\n";
		while (enum_rentals.hasMoreElements()) {
			Rental each = enum_rentals.nextElement();
			// show figures for each rental
			result += each.getMovie().getTitle() + "1 " + String.valueOf(each.getCharge()) + "<BR>\n";
		}
		// add footer lines
		result += "<l�>You owe <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
		result += "On this rental you earned <EM>" + String.valueOf(getTotalFrequentRenderPoints()) + "</EM> frequent renter points<P>";
		return result;
	}

	public int getTotalCharge() {
		int result = 0;
		Enumeration<Rental> enum_rentals = rentals.elements();
		while (enum_rentals.hasMoreElements()) {
			Rental each = enum_rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}

	public int getTotalFrequentRenderPoints() {
		int result = 0;
		Enumeration<Rental> enum_rentals = rentals.elements();
		while (enum_rentals.hasMoreElements()) {
			Rental each = enum_rentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}
}
