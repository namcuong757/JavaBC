package CoreJava1;
import java.util.Scanner; 
public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    
		
	    double blackCurrent = myObj.nextInt();  // Read user input
	    System.out.println("How many White Forest");
	    double whiteForest = myObj.nextInt();
	    System.out.println("How many Chocolate");
	    double chocolate = myObj.nextInt();
	    System.out.println("How many Red Velvet");
	    double redVelvet = myObj.nextInt();
	    
	    double total = 0;
	    double total_blackCurrent = blackCurrent * 0.5;
	    double total_whiteForest = blackCurrent * 0.3;
	    double total_chocolate = blackCurrent * 0.4;
	    double total_redVelvet = blackCurrent * 0.45;
	    
	    total = total_blackCurrent + total_whiteForest + total_chocolate + total_redVelvet;
	    total = Math.ceil(total * 100) / 100;
	    System.out.println("===============================================");
	    System.out.println("Menu Item		Price	Qty	Payable");  // Output user input
	    System.out.println("===============================================");
	    System.out.println("Black Current		$0.5    "+blackCurrent+"	"+total_blackCurrent);
	    System.out.println("White Forest		$0.3    "+whiteForest+"	"+total_whiteForest);
	    System.out.println("Chocolate		$0.4    "+chocolate+"	"+total_chocolate);
	    System.out.println("White Forest		$0.45   "+redVelvet+"	"+total_redVelvet);
	    System.out.println("===============================================");
	    System.out.println("Total: " + total);
	    
	    
	    
	    
	}

}
