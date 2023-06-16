package CoreJava1;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first side");
		int side1 = scanner.nextInt();
		System.out.println("Enter second side");
		int side2 = scanner.nextInt();
		System.out.println("Enter third side");
		int side3 = scanner.nextInt();
		if(side1 == side2 || side1 == side3 || side2 == side3)
		{
			System.out.println("isosceles triangle");
		}
		else if(side1 == side2 && side2 == side3)
		{
			System.out.println("equilateral triangle");
		}
		else
		{
			System.out.println("scalene triangle");
		}
	}

}
