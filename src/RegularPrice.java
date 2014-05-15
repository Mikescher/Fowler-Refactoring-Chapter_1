
class RegularPrice extends Price {
	@Override
	int getPriceCode() {
		return Movie.REGULAR;
	}

	@Override
	double getCharge(int daysRented) {
		double thisAmount = 0;
    	thisAmount += 2;
    	if (daysRented > 2)
        	thisAmount += (daysRented - 2) * 1.5;
		return thisAmount;
	}
}