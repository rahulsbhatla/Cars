package Cars;

/**
 * Electrical Cars are Extended from Cars and implemented from ICars. Additional
 * car details are added to the constructor
 *
 */

public class ElectricCars extends Cars implements ICars {

	private double batterycapacity;
	private double totalservicecost;
	private double totalprice;
	final double litresper = 94 * 0.145;

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	private double fulltankprice;

	ElectricCars(int carid, String carname, String cartype, Price price, double batterycapacity, String tanktype,
			CarService carservice) {
		super(carid, carname, cartype, price, tanktype, carservice);
		// TODO Auto-generated constructor stub
		this.batterycapacity = batterycapacity;

	}

	public double getBatterycapacity() {
		return batterycapacity;
	}

	public void setBatterycapacity(double batterycapacity) {
		this.batterycapacity = batterycapacity;
	}

	public double getFulltankprice() {
		return fulltankprice;
	}

	public void setFulltankprice(double fulltankprice) {
		this.fulltankprice = fulltankprice;
	}

	public double getLitresper() {
		return litresper;
	}

	/**
	 * To find Total service Cost of Electric cars we add all car service expenses
	 */
	{
		this.totalservicecost = this.carservice.getPartscost() + this.carservice.getSpareparts()
				+ this.carservice.getLabourcharge();
	}

	/**
	 * To display the details of Electric cars Class. We use toString()
	 */
	public String toString() {
		this.totalprice = this.price.getBaseprice() + this.price.getInsurance() + this.price.getTax();

		return "Car ID : " + getCarid() + "\nCar Name : " + getCarname() + "\nPrice :" + "\nBase Salary: "
				+ this.price.getBaseprice() + "\nInsurance: " + this.price.getInsurance() + "\nTax: "
				+ this.price.getTax() + "\nBattery Capacity : " + getBatterycapacity() + "\nTank Type : "
				+ getTanktype() + "\nOn Road Price of the car: " + this.totalprice + "\nCar Service Cost :"
				+ "\nParts Cost: " + this.carservice.getPartscost() + "\nSpare Parts Cost: "
				+ this.carservice.getSpareparts() + "\nLabour Cost: " + this.carservice.getLabourcharge();
	}

	public double getTotalservicecost() {
		return totalservicecost;
	}

	public void setTotalservicecost(double totalservicecost) {
		this.totalservicecost = totalservicecost;
	}

}
