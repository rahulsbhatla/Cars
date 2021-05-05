package Cars;

/**
 * Tankfull class returns the Litres/Battery capacity of cars and their
 * respective Cost to tank full the car.
 *
 */
public class Tankfull {

	public String toString(double tanklitres, String tanktype, Cars current) {
		if (current.tanktype == "Electric") {
			return "Battery capacity of the car is " + current.getBatterycapacity() + " KWh" + "\nRs: "
					+ current.getBatterycapacity() * current.getLitresper() + " is required to fully charge the car";
		}

		else {
			return "Tank litres of the car is " + current.tanklitres + " litres" + "\nRs: "
					+ current.tanklitres * current.getLitresper() + " is required to tank full the car";
		}

	}

}
