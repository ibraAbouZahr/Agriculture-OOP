import java.util.*;

public class Construction extends AnestheticLand {
	private int numberOfLevels;
	private String typeOfSoil;

	public Construction() {
		super();
		numberOfLevels = 0;
		typeOfSoil = null;
	}
	public Construction(int CountryNumber, String NameOfPerson, int idOfLand, double area, double PriceOfOneMeter, int numberOfLevels, String typeOfSoil) {
		super(CountryNumber,NameOfPerson,idOfLand,area,PriceOfOneMeter);
		this.numberOfLevels = numberOfLevels;
		this.typeOfSoil = typeOfSoil;
	}
	public Construction(int numberOfLevels, String typeOfSoil) {
		this.numberOfLevels = numberOfLevels;
		this.typeOfSoil = typeOfSoil;
	}
	public int getNumberOfLevels() {
		return numberOfLevels;
	}
	public void setNumberOfLevels(int numberOfLevels) {
		this.numberOfLevels = numberOfLevels;
	}
	public String getTypeOfSoil() {
		return typeOfSoil;
	}
	public void setTypeOfSoil(String typeOfSoil) {
		this.typeOfSoil = typeOfSoil;
	}
	public void Display() {
		super.Display();
		System.out.println("The number of levels in the land is:" + numberOfLevels);
		System.out.println("The type of soil in the land is: " + typeOfSoil);
	}
	public void ReadDetailsOfConstructionLand() {
		Scanner scan = new Scanner (System.in);
		super.ReadAnestheticLandInformation();
		System.out.println("How many levels does the land have? ");
		int level = scan.nextInt();
		System.out.println("What is the type of the soil used? ");
		String type = scan.next();
		this.numberOfLevels = level;
		this.typeOfSoil = type;

	}
	
	
	public String toString() {
		return "Construction \n number of levels: " + numberOfLevels + "\n Type of soil: " + typeOfSoil;
	}
	public double priceOfLand() {
		super.priceOfLand();
		
		return 0;
	}


}
