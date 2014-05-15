abstract class Price {
	abstract int getPriceCode();
	
	abstract double getCharge(int daysRented);
	
	int getFrequentRenterPoints(@SuppressWarnings("unused") int daysRented) {
		return 1;
	}
}