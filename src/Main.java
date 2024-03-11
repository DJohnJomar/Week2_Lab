//A java program that calculates shipping cost based on the items' weight and method of shipping
//February 20, 2024 - February 20, 2024
//3CS-A || Dimaunahan, Meneses
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       
        while(true){
        	
        	try {
        		System.out.println("\nIs the package insured? [Y/N]");
                String string  = reader.readLine();
                char choice = string.charAt(0);
                userInput(choice);
        	}catch (Exception e) {
        		System.out.println("An error has occured, please try again.");
        	}
        	
        }
    }
    
    
    /*
     * Function that will receive user input of choice 
     * of regular or insured package, package weight, 
     * and shipping method.  
     */
    public static void userInput(char choice) throws IOException {
    	
    	if(choice == 'Y' || choice == 'N') {
    		System.out.print("\nWhat is the weight of the package in lbs.: ");
        	int weight = Integer.parseInt(reader.readLine());
        	System.out.println("\n[A] Air");
        	System.out.println("[T] Truck");
        	System.out.println("[M] Mail");
        	System.out.print("Choose a shipping method: ");
        	String methodString = reader.readLine();
        	char method = methodString.charAt(0);
        	
        	if (choice == 'Y') {
        		InsuredPackage insuredPackage = new InsuredPackage(weight, method);
            	System.out.println("\nInsured Package: "+ insuredPackage.display());
        	} else if (choice == 'N') {
        		Package newPackage = new Package(weight, method);
            	System.out.println("\nPackage: "+ newPackage.display());
        	}
    	} else {
    		System.out.println("Command does not exist. Try again.");
    	}
    }
}
