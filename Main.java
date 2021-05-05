package Cars;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/**
		 * @author 91893 Retrieving an instance of our database using getInstance()
		 *         db.data() will store all the data of Employees
		 * 
		 * 
		 * 
		 */
		System.out.println("Welcome to Cars24");
		System.out.println("**************************************");
		System.out.println("ID 1-Maruti Swift");
		System.out.println("ID 2-Kia Seltos");
		System.out.println("ID 3-Skoda Rapid");
		System.out.println("ID 4-Ford Aspire");
		System.out.println("ID 5-Tata Altroz");
		System.out.println("ID 6-Mahindra Thar");
		System.out.println("ID 7-Hyundai Kona Electric");
		System.out.println("ID 8-Tata Tigor EV");

		System.out.println("**************************************");

		CarsDatabase db = CarsDatabase.getInstance();
		db.data();

		salaries(db, in);

	}

	public static void salaries(CarsDatabase db, Scanner in) {
		char ex;
		do {

			System.out.println("Welcome to Cars24");
			System.out.println("1-For more Details about the Car");
			System.out.println("2-Price to Tank Full the Car");
			System.out.println("3-Fuel Consumption after Travelling some distance");
			System.out.println("4-Milage of the Car");
			System.out.println("5-Maintanence Cost of all Cars");
			System.out.println("6-Which type of car is best to travel inside city");
			System.out.println("7-which type of car is best to travel long drives?");
			System.out.println("8-Exit");

			int choice = in.nextInt();
			int i = 0;
			if (choice < 9) {

				{
					switch (choice)

					{

					case 1:
						int eid1 = checkingID(db, in, i);
						Cars current = db.printCarDetails(eid1);
						// Cars c1 = new Cars();
						System.out.println(current);
						break;
					// gotoMainpage(db,in);
					case 2:
						int eid2 = checkingID(db, in, i);
						Cars current2 = db.printCarDetails(eid2);
						// display(current.tanklitres,current.tanktype,current);
						Tankfull f = new Tankfull();
						System.out.println(f.toString(current2.tanklitres, current2.tanktype, current2));
						break;

					case 3:
						int eid3 = checkingID(db, in, i);
						Cars current3 = db.printCarDetails(eid3);
						System.out.println("Enter the Distance you want to travel: ");
						double distance = in.nextDouble();
						Distance d = new Distance();
						Alltypes a = new Alltypes();
						System.out.println(a.toString(current3.tanklitres, current3.tanktype, current3, distance));
						System.out.println(d.toString(current3.tanklitres, current3.tanktype, current3,
								a.getDistance1(), distance));
						break;

					case 4:
						int eid4 = checkingID(db, in, i);
						Cars current4 = db.printCarDetails(eid4);
						System.out.println("Enter the Distance you want to travel: ");
						distance = in.nextDouble();
						Mileage m = new Mileage();
						Alltypes a1 = new Alltypes();
						System.out.println(a1.toString(current4.tanklitres, current4.tanktype, current4, distance));
						System.out.println(m.toString(current4.tanklitres, current4.tanktype, current4, distance,
								a1.getDistance1()));
						break;

					case 5:
						int eid5 = checkingID(db, in, i);
						Cars current5 = db.printCarDetails(eid5);
						distance = 100;
						Alltypes a2 = new Alltypes();
						System.out.println(a2.toString(current5.tanklitres, current5.tanktype, current5, distance));
						MonthlyMaitanence mm = new MonthlyMaitanence();
						System.out.println(mm.toString(current5.tanklitres, current5.tanktype, current5,
								a2.getDistance1(), distance));

						break;

					case 6:
						int eid6;
						double min = 0;
						double allmin = Integer.MAX_VALUE;
						for (eid6 = 1; eid6 <= 8; eid6++) {
							Cars current6 = db.printCarDetails(eid6);
							System.out.println(eid6);
							distance = 100;

							Alltypes a3 = new Alltypes();
							System.out.println(a3.toString(current6.tanklitres, current6.tanktype, current6, distance));
							System.out.println(current6.carname);
							current6.min = a3.getDistance1() * current6.getLitresper()
									+ (current6.getTotalservicecost() / 12);
							System.out.println("Rs: " + Math.round(current6.min) + " monthly\n");
							allmin = Math.min(current6.min, allmin);

						}
						int eid10;
						for (eid10 = 1; eid10 <= 8; eid10++) {
							Cars current10 = db.printCarDetails(eid10);
							if (allmin == current10.min) {
								System.out.println("\nBest Car to travel inside the city");
								System.out.println(current10.tanktype);
								System.out.println(current10.cartype);
								System.out.println(current10.carname);
							}
						}
						System.out.println("Rs: " + Math.round(allmin) + " monthly");
						break;

					case 7:
						int eid7;
						double allmax = Integer.MIN_VALUE;
						for (eid7 = 1; eid7 <= 8; eid7++) {
							Cars current7 = db.printCarDetails(eid7);
							System.out.println(eid7);
							System.out.println(current7.carname);
							System.out.println(current7.tanktype);
							if (current7.tanktype == "Petrol") {
								current7.max = current7.tanklitres * 12.5;
							} else if (current7.tanktype == "Diesel") {
								current7.max = current7.tanklitres * 15;
							} else if (current7.tanktype == "Electric") {
								current7.max = current7.getBatterycapacity() * 6.67;
							}
							System.out.println(current7.max + " kms");
							System.out.println("\n");

							allmax = Math.max(current7.max, allmax);
						}
						int eid11;
						for (eid11 = 1; eid11 <= 8; eid11++) {
							Cars current11 = db.printCarDetails(eid11);
							if (allmax == current11.max) {
								System.out.println("\nBest Car to travel long drives :");
								System.out.println(current11.tanktype);
								System.out.println(current11.cartype);
								System.out.println(current11.carname);
							}
						}
						System.out.println("Distance " + Math.round(allmax) + " kms");
						break;

					case 8:
						System.exit(0);
						break;

					default:
						System.out.println("Wrong Input Check again!!!");

					}
				}

			} else {
				System.out.println("Wrong Input!!.Please Check Again");
			}

			System.out.println("Do you want to Continue(y/n)");
			ex = in.next().charAt(0);

		} while (ex == 'y' || ex == 'Y');
	}

	public static int checkingID(CarsDatabase db, Scanner in, int i) {
		System.out.println("Enter the Car ID : ");
		i = in.nextInt();
		if (db.isPresent(i))
			return i;

		else {

			System.out.print("The ID entered does not exist in our DatBase");
		}

		return 0;
	}

}
