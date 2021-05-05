package Cars;

import java.util.ArrayList;

/**
 * @author Rahul
 * 
 * @CarsDatabase is used to Store all information of the cars
 *
 */
public class CarsDatabase {
	private static CarsDatabase db;
	static ArrayList<Cars> CarsList;

	private CarsDatabase() {

	}

	/**
	 * This is a singleton method and it has the details of the Cars Database
	 */
	public static CarsDatabase getInstance() {
		if (db == null)
			db = new CarsDatabase();
		return db;

	}

	/**
	 * 
	 * @param c addCars method is used to add the Cars to the List.
	 */
	public static void addCars(Cars c) {
		if (CarsList == null)
			CarsList = new ArrayList<Cars>();
		CarsList.add(c);
	}

	/**
	 * data method stores all the data related to Cars and adds to list.
	 */
	public void data() {

		Price price1 = new Price(566000, 20000, 14000);
		CarService carservice1 = new CarService(2000, 1200, 1300);
		PetrolCars p1 = new PetrolCars(001, "Maruti Swift", "Hatchback", price1, 37, "Petrol", carservice1);
		addCars(p1);
		Price price2 = new Price(995000, 69650, 48220);
		CarService carservice2 = new CarService(3000, 2000, 1200);
		PetrolCars p2 = new PetrolCars(002, "Kia Seltos", "SUV", price2, 50, "Petrol", carservice2);
		addCars(p2);
		Price price3 = new Price(779000, 54530, 30384);
		CarService carservice3 = new CarService(2400, 1400, 1200);
		PetrolCars p3 = new PetrolCars(003, "Skoda Rapid", "Sedan", price3, 55, "Petrol", carservice3);
		addCars(p3);

		Price price4 = new Price(837000, 86968, 35583);
		CarService carservice4 = new CarService(2400, 1400, 1200);
		DieselCars p4 = new DieselCars(004, "Ford Aspire", "Sedan", price4, 42, "Diesel", carservice4);
		addCars(p4);
		Price price5 = new Price(566000, 20000, 14000);
		CarService carservice5 = new CarService(2000, 1200, 1300);
		DieselCars p5 = new DieselCars(005, "Tata Altroz", "Hatchback", price5, 37, "Diesel", carservice5);
		addCars(p5);
		Price price6 = new Price(1231681, 160118, 75627);
		CarService carservice6 = new CarService(3000, 2000, 1200);
		DieselCars p6 = new DieselCars(006, "Mahindra Thar", "SUV", price6, 57, "Diesel", carservice6);
		addCars(p6);
		Price price7 = new Price(2377900, 72370, 11000);
		CarService carservice7 = new CarService(1500, 1200, 1300);
		ElectricCars p7 = new ElectricCars(007, "Hyundai Kona Electric", "SUV", price7, 39.2, "Electric", carservice7);
		addCars(p7);
		Price price8 = new Price(958375, 41129, 14000);
		CarService carservice8 = new CarService(1500, 1000, 1000);
		ElectricCars p8 = new ElectricCars(8, "Tata Tigor EV", "Sedan", price8, 21.5, "Electric", carservice8);
		addCars(p8);

	}

	/**
	 * 
	 * @param eid
	 * @return To check if the entered id is present in the list or not
	 */
	public boolean isPresent(int eid) {
		for (Cars e : CarsList) {
			if (e.getCarid() == eid)
				return true;
		}
		return false;
	}

	/**
	 * 
	 * @param eid
	 * @return Check if id matches and return current car
	 */
	public Cars printCarDetails(int eid) {
		for (Cars e : CarsList) {
			if (e.getCarid() == eid) {
				return e;

			}

		}
		return null;
	}
}