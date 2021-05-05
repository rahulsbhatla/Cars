package Cars;

/**
 * 
 * Monthly Maintanence is used to Calaculate Cost required to travell 100 kms +
 * service charges anually/12. <br>
 * Monthly Maintanence deals with all service related cost and also monthly fuel
 * cost if we travel 100km. <br>
 * We return Monthly cost of all Cars.
 */
public class MonthlyMaitanence {
	double Maintanence;

	public double getMaintanence() {
		return Maintanence;
	}

	public void setMaintanence(double maintanence) {
		Maintanence = maintanence;
	}

	public String toString(double tanklitres, String tanktype, Cars current, double distance1, double distance) {
		if (current.tanktype == "Electric") {
			double left = current.getBatterycapacity() - distance1;
			if (left > 0) {
				return "Cost to cover " + distance + " kms in " + current.tanktype + " is Rs. "
						+ distance1 * current.getLitresper() + "\nCar Service Charge : Rs. "
						+ (current.carservice.getPartscost() + current.carservice.getSpareparts()
								+ current.carservice.getLabourcharge())
						+ " annually" + "\nMonthly Maintanence Cost for " + current.tanktype + " cars is Rs. "
						+ ((distance1 * 0.145 * current.getLitresper()) + (current.getTotalservicecost() / 12));
			} else {
				return "No Power left in Battery";
			}

		} else {
			double left = current.tanklitres - distance1;
			if (left > 0) {
				return "Cost to cover " + distance + " kms in " + current.tanktype + " is Rs. "
						+ distance1 * current.getLitresper() + "\nCar Service Charge : Rs. "
						+ (current.carservice.getPartscost() + current.carservice.getSpareparts()
								+ current.carservice.getLabourcharge())
						+ " annually" + "\nMonthly Maintanence Cost for " + current.tanktype + " cars is Rs. "
						+ ((distance1 * current.getLitresper()) + (current.getTotalservicecost() / 12));
			} else {
				return "No " + current.tanktype + " left in tank";
			}
		}

	}

}
