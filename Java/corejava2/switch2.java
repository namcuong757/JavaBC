package corejava2;
import  java.util.*;

public class switch2 {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Charater: ");
		String chara = scanner.nextLine();
		String check_chara = chara.toLowerCase();
		String result;
		switch(check_chara)
		{
			case "a", "e", "i", "o": 
				result = "Vowel";
				break;
			default:
				result = "Consonant";
		}
		System.out.println(chara + " is " + result);
	}
	
	
}
