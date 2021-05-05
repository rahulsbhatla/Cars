package Cars;

/**
 * 
 * Distance class is used to return fuel left in the car after travelling some
 * distance. If fuel goes to 0 then it return no fuel left in tank.
 *
 */
public class Distance {

	public String toString(double tanklitres, String tanktype, Cars current, double distance1, double distance) {
		if (current.tanktype == "Electric") {
			double left = current.getBatterycapacity() - distance1;
			if (left > 0) {
				return "Battery Capacity of the car is " + current.getBatterycapacity() + " kWh" + "\nAfter " + distance
						+ " kms " + current.tanktype + " left in car is " + left;

			} else {
				return "No Power left in Battery";
			}

		} else {
			double left = current.tanklitres - distance1;
			if (left > 0) {
				return "No of litres present in car is " + current.tanklitres + " litres" + "\nAfter " + distance
						+ " kms " + current.tanktype + " left in car is " + left + " litres";
			} else {
				return "No " + current.tanktype + " left in tank";
			}
		}

	}

}
