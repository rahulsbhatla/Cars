package Cars;

/**
 * 
 * Mileage class is used to Calculate Mileage of a Car using Distance travelled
 * and fuel uttilized . It returns fuel capacity distance and Milage of the car
 *
 */
public class Mileage extends Distance {

	public String toString(double tanklitres, String tanktype, Cars current, double distance, double distance1) {

		if (current.tanktype == "Electric") {
			double left = current.getBatterycapacity() - distance1;
			if (left > 0) {
				return "Battery Capacity of the car is " + current.getBatterycapacity() + " kWh" + "\nAfter " + distance
						+ " kms " + current.tanktype + ".\nMilage given by the car is " + distance / distance1 + " kms";

			} else {
				return "No Power left in Battery";
			}

		} else {
			double left = current.tanklitres - distance1;

			if (left > 0) {
				return "No of litres present in car is " + current.tanklitres + " litres" + "\nAfter " + distance
						+ " kms on " + current.tanktype + ".\nMilage given by the car is " + distance / distance1
						+ " kms";

			} else {
				return "No" + current.tanktype + " left in tank";
			}

		}
	}
}