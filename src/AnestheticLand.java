import java.util.*;
interface LandPrice {

	public double priceOfLand();
}

abstract class AnestheticLand extends Country implements LandPrice {
	
	protected String NameOfPerson;
	protected int idOfLand;
	protected double area;
	protected double PriceOfOneMeter;
	
	
	public double priceOfLand() {
		return 50.0;
	}
	public AnestheticLand() {
		super();
		NameOfPerson = null;
		idOfLand = 0;
		area = 0.0;
		PriceOfOneMeter = 0.0;
	}
	
	
	public AnestheticLand(int Nb, String NameOfPerson, int idOfLand, double area, double PriceOfOneMeter) {
		CountryNumber = Nb;
		this.NameOfPerson = NameOfPerson;
		this.idOfLand = idOfLand;
		this.area = area;
		this.PriceOfOneMeter = PriceOfOneMeter;
		
	}
	/*This method is a constructor for the class AnestheticLand that takes an argument of type AnestheticLand it creates
	 *  and object of type AnestheticLand while initializing its attributes by using priceOfLand argument.*/
	
	public AnestheticLand(AnestheticLand priceOfLand) {
		
	}


	public String getNameOfPerson() {
		return NameOfPerson;
	}


	public void setNameOfPerson(String nameOfPerson) {
		NameOfPerson = nameOfPerson;
	}


	public int getIdOfLand() {
		return idOfLand;
	}


	public void setIdOfLand(int idOfLand) {
		this.idOfLand = idOfLand;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	public double getPriceOfOneMeter() {
		return PriceOfOneMeter;
	}


	public void setPriceOfOneMeter(double priceOfOneMeter) {
		PriceOfOneMeter = priceOfOneMeter;
	}
	public void Display() {
		System.out.println("The Country number  is " + super.CountryNumber );
		System.out.println("The name is " + NameOfPerson);
		System.out.println("The id is " + idOfLand );
		System.out.println("The area is " + area);
		System.out.println("The price of one meter is " + PriceOfOneMeter);
		
		
	}
	public void ReadAnestheticLandInformation() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the name of the person? ");
		String name = scan.next();
		System.out.println("What is the land's ID? ");
		int idOfLand = scan.nextInt();
		System.out.println("What is the area of the land? ");
		double area = scan.nextDouble();
		System.out.println("What is the price of one meter? ");
		double meter = scan.nextDouble();
		
		
	}

}
