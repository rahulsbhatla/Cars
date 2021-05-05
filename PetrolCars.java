package Cars;

/**
 * Petrol Cars are Extended from Cars and implemented from ICars. Additional car
 * details are added to the constructor
 *
 */
public class PetrolCars extends Cars implements ICars {

	private double totalprice;
	private double totalservicecost;
	private double milage;
	private double fulltankprice;
	final double litresper = 94;
	private double distance;

	PetrolCars(int carid, String carname, String cartype, Price price, double tanklitres, String tanktype,
			CarService carservice) {
		super(carid, carname, cartype, price, tanktype, carservice);
		// TODO Auto-generated constructor stub
		this.tanklitres = tanklitres;
	}

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	public double getMilage() {
		return milage;
	}

	public void setMilage(double milage) {
		this.milage = milage;
	}

	public double getFulltankprice() {
		return fulltankprice;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public void setFulltankprice(double fulltankprice) {
		this.fulltankprice = fulltankprice;
	}

	public double getLitresper() {
		return litresper;
	}

	public double getDistance1() {
		return distance1;
	}

	public double getTotalservicecost() {
		return totalservicecost;
	}

	public void setTotalservicecost(double totalservicecost) {
		this.totalservicecost = totalservicecost;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public void setDistance1(double distance1) {
		this.distance1 = distance1;
	}

	double distance1 = distance / 15;
	/**
	 * To find Total service Cost of Petrol cars we add all car service expenses
	 */
	{
		this.totalservicecost = this.carservice.getPartscost() + this.carservice.getSpareparts()
				+ this.carservice.getLabourcharge();
	}

	/**
	 * To display the details of Petrol cars Class. We use toString()
	 */

	public String toString() {
		this.totalprice = this.price.getBaseprice() + this.price.getInsurance() + this.price.getTax();

		return "Car ID : " + getCarid() + "\nCar Name : " + getCarname() + "\nPrice :" + "\nBase Salary: "
				+ this.price.getBaseprice() + "\nInsurance: " + this.price.getInsurance() + "\nTax: "
				+ this.price.getTax() + "\nCar Tank Capacity : " + getTanklitres() + "\nTank Type : " + getTanktype()
				+ "\nOn Road Price of the car: " + this.totalprice + "\nCar Service Cost :" + "\nParts Cost: "
				+ this.carservice.getPartscost() + "\nSpare Parts Cost: " + this.carservice.getSpareparts()
				+ "\nLabour Cost: " + this.carservice.getLabourcharge();
	}

}
