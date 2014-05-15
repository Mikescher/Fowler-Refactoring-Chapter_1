
class ChildrensPrice extends Price {
	@Override
	int getPriceCode() {
		return Movie.CHILDRENS;
	}

	@Override
	double getCharge(int daysRented) {
		double thisAmount = 0;
    	thisAmount += 1.5;
    	if (daysRented > 3)
        	thisAmount += (daysRented - 3) * 1.5;
		return thisAmount;
	}
}