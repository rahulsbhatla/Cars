package Cars;

/**
 * 
 * @author 91893 Price class is has a relationship . Price class has 3 instances
 *         Base price,Insurance and Tax which combined will be the total price
 *         of the car.
 */

public class Price {

	private double baseprice;
	private double insurance;
	private double tax;

	Price(double baseprice, double insurance, double tax) {
		this.baseprice = baseprice;
		this.insurance = insurance;
		this.tax = tax;
	}

	public double getBaseprice() {
		return baseprice;
	}

	public void setBaseprice(double baseprice) {
		this.baseprice = baseprice;
	}

	public double getInsurance() {
		return insurance;
	}

	public void setInsurance(double insurance) {
		this.insurance = insurance;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

}