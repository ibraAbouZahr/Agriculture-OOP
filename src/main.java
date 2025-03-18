import java.util.*;
public class main {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the new program made for farmers and land owners to organize their lands and possesions!");
		System.out.println("---------------------------------------------------------------------------------------------------");
		for(int i = 0; i < 3; i ++) {
		System.out.println("Loading...");
		// something i saw online and i found very interesting to use!
		Thread.sleep(1000);
		}
		System.out.println("Loading Complete!");
		System.out.println("Enter the name of the province:");
        String provinceName = scan.next();
        System.out.println("Enter the number of anesthetic lands in the province:");
        int numberOfAnestheticLands = scan.nextInt();
        Province province = new Province(provinceName, numberOfAnestheticLands);
        
        
		
		AnestheticLand [] lands = new AnestheticLand[numberOfAnestheticLands];
		Agriculture[] agricultures = new Agriculture[numberOfAnestheticLands];
		Construction[] construction = new Construction[numberOfAnestheticLands];
		
		
		for(int i = 0; i < numberOfAnestheticLands; i++) {
			
			System.out.println("Type 'A' for agricultural land and 'C' for construction land: ");
			char c = scan.next().charAt(0);
			System.out.println("---------------------------------------------------------------------------------------------------");
			if( c == 'C') {
				lands[i] = new Construction();
				System.out.println("Give the construction land details: ");
				((Construction)lands[i]).ReadDetailsOfConstructionLand();
				province.AddAnestheticLand((Construction)lands[i]);
				
				
				
				
			System.out.println("---------------------------------------------------------------------------------------------------");
			}
			else if( c == 'A') {
				lands[i] = new Agriculture();
				System.out.println("Give the Agriculture land details: ");
				((Agriculture)lands[i]).ReadDetailsOfAgricultureLand();
				province.AddAnestheticLand((Agriculture)lands[i]);
				
				
				System.out.println("---------------------------------------------------------------------------------------------------");
			}
			
		
		}
		System.out.println("The land(s) in your province are: ");
		System.out.println("---------------------------------------------------------------------------------------------------");
		province.display();
		System.out.println();
		int NumAgri = province.FindNumberOfAgricultureLands();
		System.out.println("The number of agricultural lands is: " + NumAgri );
		int NumCons = province.FindNumberOfConstructionLand();
		System.out.println("The number of construction lands is: " + NumCons );
		System.out.println("---------------------------------------------------------------------------------------------------");
		province.storeData("agriculture.txt", "construction.txt");
		System.out.println("Enter the ID of the land you want to search for: ");
		int id = scan.nextInt();
		int index = province.searchLandById(id);
		if(index == -1) {
			System.out.println("The land is not found in the province!");
		}
		else {
			System.out.println("The land is found on index: " + index);
		}
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("Do you want to delete a land by it's ID? ");
		System.out.println("Press 'Y' for Yes and 'N' for No");
		char del = scan.next().charAt(0);
		if(del == 'Y' ) {
			System.out.println("Enter the ID of the land you want to delete:");
			int id2 = scan.nextInt();
			province.DeleteAnestheticLand(id2);
			
		}
		else if (del == 'N') {
			System.out.println("Okay, no land will be deleted.");
		}
		else {
			System.out.println("Invalid input!");
		}
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("Thank you for using the program!");
		
		
	}
}

