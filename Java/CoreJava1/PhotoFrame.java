package CoreJava1;
import java.util.Scanner;
public class PhotoFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 1st side: ");
		int side1 = scanner.nextInt();
		System.out.println("Enter 2nd side: ");
		int side2 = scanner.nextInt();
		
		if(side1 == side2) System.out.println("Square");
		else System.out.println("Rectangel");
	}

}
