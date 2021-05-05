package Cars;

/**
 * 
 * Cars class is a parent class.It implements from ICars . It has all the
 * details of a Car.
 *
 */
public class Cars implements ICars {

	int carid;
	String carname, cartype, tanktype;
	Price price;
	CarService carservice;
	double tanklitres, batterycapacity, litresper, left, distance, totalservicecost, distance1, min, max, allmin;

	Cars(int carid, String carname, String cartype, Price price, String tanktype, CarService carservice) {
		this.carid = carid;
		this.carname = carname;
		this.cartype = cartype;
		this.setPrice(price);
		this.tanktype = tanktype;
		this.setCarservice(carservice);
	}

	Cars() {

	}

	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public String getTanktype() {
		return tanktype;
	}

	public void setTanktype(String tanktype) {
		this.tanktype = tanktype;
	}

	public double getBatterycapacity() {
		return batterycapacity;
	}

	public void setBatterycapacity(double batterycapacity) {
		this.batterycapacity = batterycapacity;
	}

	public double getDistance1() {
		return distance1;
	}

	public void setDistance1(double distance1) {
		this.distance1 = distance1;
	}

	public CarService getCarservice() {
		return carservice;
	}

	public void setCarservice(CarService carservice) {
		this.carservice = carservice;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getCartype() {
		return cartype;
	}

	public void setCartype(String cartype) {
		this.cartype = cartype;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public double getTanklitres() {
		return tanklitres;
	}

	public void setTanklitres(double tanklitres) {
		this.tanklitres = tanklitres;
	}

	public int getId() {
		return carid;
	}

	public String getName() {
		return carname;
	}

	public String getType() {

		return cartype;
	}

	public double getLeft() {
		return left;
	}

	public void setLeft(double left) {
		this.left = left;
	}

	public double getLitresper() {
		return litresper;
	}

	public String gettanktype() {

		return tanktype;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
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

	public double getAllmin() {
		return allmin;
	}

	public void setAllmin(double allmin) {
		this.allmin = allmin;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public String display() {
		return "carname";
	}

	public double getTotalservicecost() {
		return totalservicecost;
	}

	public void setTotalservicecost(double totalservicecost) {
		this.totalservicecost = totalservicecost;
	}

	@Override
	public CarService getCarService() {
		return carservice;
	}

}
