package Cars;

/**
 * 
 * I am using Alltypes class with tostring method for code reusabilty. This
 * method will return the distance Covered in various tanktypes.
 *
 */
public class Alltypes {

	double distance1;

	public double getDistance1() {
		return distance1;
	}

	public void setDistance1(double distance1) {
		this.distance1 = distance1;
	}

	public String toString(double tanklitres, String tanktype, Cars current, double distance) {

		if (current.tanktype == "Petrol") {
			distance1 = distance / 12.5;
			// return "distance is " +distance1;
		} else if (current.tanktype == "Diesel") {
			distance1 = distance / 15;
			// return "distance is " +distance1;
		} else {
			distance1 = (distance / 6.67);
			// return "distance is " +distance1;
		}
		return tanktype;

	}
}
