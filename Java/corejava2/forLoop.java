package corejava2;

import java.util.Scanner;

public class forLoop {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Jave is easy to learn");
			System.out.print("Enter choice(0. Yes, 1. No): ");
			int input = scanner.nextInt();
			if(input == 1) break;
		}
	}
	
}
