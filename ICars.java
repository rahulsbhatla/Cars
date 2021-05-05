package Cars;

/**
 * 
 * ICars interface has all the basic details of the Cars.
 *
 */
public interface ICars {
	public int getId();

	public String getName();

	public String getType();

	public Price getPrice();

	public String gettanktype();

	public CarService getCarService();

}
