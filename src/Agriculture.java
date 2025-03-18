import java.util.*;
public class Agriculture extends AnestheticLand {
private String cropToBeSeeded;
	
	
	public Agriculture() {
		super();
		cropToBeSeeded = null;
	}
	// A constructor taking all attributes form previous super classes
	public Agriculture(String cropToBeSeeded, int CountryNumber, String NameOfPerson, int idOfLand, double area, double PriceOfOneMeter){
		super(CountryNumber,NameOfPerson,idOfLand,area,PriceOfOneMeter);
		this.cropToBeSeeded = cropToBeSeeded;
	}
	

	public Agriculture(String cropToBeSeeded) {
		this.cropToBeSeeded = cropToBeSeeded;
	}

	public String getCropToBeSeeded() {
		return cropToBeSeeded;
	}

	public void setCropToBeSeeded(String cropToBeSeeded) {
		this.cropToBeSeeded = cropToBeSeeded;
	}
	public void Display() {
		super.Display();
		System.out.println(" \n The crop to be seeded is " + cropToBeSeeded);
	}
	public void ReadDetailsOfAgricultureLand() {
		Scanner scan = new Scanner(System.in);
		super.ReadAnestheticLandInformation();
		System.out.println("What is the crop to be seeded? ");
		String j = scan.next();
		this.cropToBeSeeded = j;
	}
	
	
	public String toString() {
		return " \n Agriculture crop to be seeded: " + cropToBeSeeded;
	}
	public double priceOfLand() {
		super.priceOfLand();
		
		return 0;
	}

}
