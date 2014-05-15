
class NewReleasePrice extends Price {
	@Override
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	@Override
	int getFrequentRenterPoints(int daysRented) {
		return (daysRented > 1) ? 2 : 1;
	}
	
	@Override
	double getCharge(int daysRented) {
		double thisAmount = 0;
    	thisAmount += daysRented * 3;
		return thisAmount;
	}
}