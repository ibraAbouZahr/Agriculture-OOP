
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Province {
	private String name;
	private int NumberOfAnestheticLands;
	/*
	 * Since aggregation is a has a relationship, then we should define a member
	 * variable or object of one class as an instance of another class in order to
	 * integrate an aggregation relationship between classes.
	 */
	private AnestheticLand anestheticLand;
	private AnestheticLand L[];
	


	public Province(String s, int size) {
		super();
		this.name = s;
		NumberOfAnestheticLands = size;
		this.L = new AnestheticLand[size];
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfAnestheticLands() {
		return NumberOfAnestheticLands;
	}

	public void setNumberOfAnestheticLands(int numberOfAnestheticLands) {
		NumberOfAnestheticLands = numberOfAnestheticLands;
	}

	public AnestheticLand getAnestheticLand() {
		return anestheticLand;
	}

	public void setAnestheticLand(AnestheticLand anestheticLand) {
		this.anestheticLand = anestheticLand;
	}

	public boolean isFull() {
		for (int i = 0; i < L.length; i++) {
			if (L[i] == null) {
				return false;
			}
		}
		return true;
	}

	public boolean isEmpty() {
		for (int i = 0; i < L.length; i++) {
			if (L.length == 0) {
				return true;
			}
		}
		return false;
	}

	public boolean AddAnestheticLand(AnestheticLand Land) {
		for(int i = 0; i < L.length ; i++) {
		if (L[i] == null) {
			L[i] = Land;
			NumberOfAnestheticLands++;
			return true;
		}
		}
		return false;
	}

	public boolean AnestheticLandSearch(AnestheticLand Land) {
		for (int i = 0; i < L.length; i++) {
			if (L[i] == Land) {
				return true;
			}
		}
		return false;
	}

	public boolean DeleteAnestheticLand(int idland) {
			for (int i = 0; i < L.length; i++) {
				if (L[i] != null && L[i].getIdOfLand() == idland) {
					L[i] = null;
					NumberOfAnestheticLands--;
					return true;
				}
			}

		
		return false;
	}

	public int searchLandById(int l) {
		for (int i = 0; i < L.length; i++) {
			if (L[i].getIdOfLand() == l) {
				return i;
			}
		}
		return -1;

	}
	

	
	public String toString() {
		return "Province name: " + name + "\n NumberOfAnestheticLands:" + NumberOfAnestheticLands + "\n anestheticLand: "+ anestheticLand + "\n Land: " + Arrays.toString(L);
	}

	public void display() {
	    if (isEmpty()) {
	        System.out.println("There are no lands to be displayed!");
	    } else {
	        System.out.println("The name of the province is " + name);
	        System.out.println("The number of anesthetic lands in the province is " + NumberOfAnestheticLands/2);
	        for (int i = 0; i < L.length; i++) {
	            if (L[i] != null) {
	                System.out.println("Land " + (i + 1) + ": " + L[i].toString());
	            }
	        }
	    }
	}

	public int FindNumberOfAgricultureLands() {
		int countOfNumberOfAgricultureLands = 0;
		for (int i = 0; i < L.length; i++) {
			if (L[i] instanceof Agriculture) {
				countOfNumberOfAgricultureLands++;
			}
		}
		return countOfNumberOfAgricultureLands;
	}

	public int FindNumberOfConstructionLand() {
		int countOfNumberOfConstructionLands = 0;
		for (int i = 0; i < L.length; i++) {
			if (L[i] instanceof Construction) {
				countOfNumberOfConstructionLands++;
			}
		}
		return countOfNumberOfConstructionLands;
	}
	public boolean UpdateLandInformation(int id) {
		for (int i = 0; i < L.length; i++) {
			if(L[i].getIdOfLand() == id) {
				return true;
			}
		}
		return false;
	}
	public boolean MergeTwoLands(int id1, int id2) {
		
		    int index1 = searchLandById(id1) ,index2 = searchLandById(id2);
		    // make sure lands exist
		   if(index1 == -1 || index2 == -1) {
			   return false;
		   }
		   String land1 = L[index1].getNameOfPerson();
		   String land2 = L[index2].getNameOfPerson();
		   
		   
		   L[index1].setNameOfPerson(land1 + "" + land2);
		   L[index1].setArea(L[index1].getArea() + L[index2].getArea());
		   L[index1].setPriceOfOneMeter(L[index1].getPriceOfOneMeter() + L[index2].getPriceOfOneMeter());
		   
		   DeleteAnestheticLand(id2); 
		   
		   
		   return true;
	}
	
		
	
	
		public void storeData(String argFileName, String conFileName) {
		    try {
		        File argFile = new File(argFileName);
		        // agriculture file object created
		        File conFile = new File(conFileName);
		        // construction file object created
		        FileWriter argWriter = new FileWriter(argFile);
		        FileWriter conWriter = new FileWriter(conFile);
		        for (int i = 0; i < L.length; i++) {
		            if (L[i] instanceof Agriculture) {
		                argWriter.write(L[i].toString());
		            } else if (L[i] instanceof Construction) {
		                conWriter.write(L[i].toString());
		            }
		        }
		        argWriter.close();
		        conWriter.close();
		        System.out.println("Data was stored.");
		    } catch (IOException e) {
		        System.out.println("An error occurred while writing to file: " + e.getMessage());
		    }
		}
		public Agriculture[] TakeAgricultureInfoFromFile(String argFileName) throws IOException {
			for(int i = 0; i < L.length; i++) {
				if(L[i] instanceof Agriculture) {
					FileReader Agri = new FileReader(argFileName);
					
				}
			}
			return null;
			
			
			
		}
		public Construction[] TakeconstructionInfoFromFile(String conFileName) throws IOException {
			for(int i = 0; i < L.length; i++) {
				if(L[i] instanceof Construction) {
					FileReader Cons = new FileReader(conFileName);
					
				}
			}
			return null;
			
			
			
		}
				
			
		}
	
	





