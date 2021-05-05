package Cars;

/**
 * 
 * @author Rahul
 * @CarService CarService class is has a relationship .All the parts cost,spare
 *             parts cost and labour charge are composed in Car service.
 *
 */
public class CarService {

	private double Partscost;
	private double Spareparts;
	private double Labourcharge;

	CarService(double Partscost, double Spareparts, double Labourcharge) {
		this.setPartscost(Partscost);
		this.setSpareparts(Spareparts);
		this.setLabourcharge(Labourcharge);
	}

	public double getSpareparts() {
		return Spareparts;
	}

	public void setSpareparts(double spareparts) {
		Spareparts = spareparts;
	}

	public double getLabourcharge() {
		return Labourcharge;
	}

	public void setLabourcharge(double labourcharge) {
		Labourcharge = labourcharge;
	}

	public double getPartscost() {
		return Partscost;
	}

	public void setPartscost(double partscost) {
		Partscost = partscost;
	}

}
