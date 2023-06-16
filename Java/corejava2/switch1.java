package corejava2;
import  java.util.*;

public class switch1 {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Month \n1.January \n2.Febuary \n... \nDecember");
		int month = scanner.nextInt();
		String season;
		switch(month)
		{
			case 1, 2, 3: 
				season = "Spring";
				break;
			case 4,5,6:
				season = "Summer";
				break;
			case 7,8,9:
				season = "Fall";
				break;
			default:
				season = "Winter";
		}
		System.out.println("Season: " + season);
	}
	
	
}
