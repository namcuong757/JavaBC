package corejava2;
import  java.util.*;
public class loop {
	public void print()
	{
		int i = 10;
		while(i <= 20)
		{
			
			System.out.println(i);
		}
	}
	public void printEven()
	{
		int i = 100;
		while(i <= 120)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String args[])
	{
		
		int start = 0;
		int end = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter start: ");
		start = scanner.nextInt();
		System.out.print("Enter end: ");
		end = scanner.nextInt();
		int middle = (end - start) / 2;
		int i = start;
		while(i <= end)
		{
			if(i == middle+1)
			{
				System.out.println(i);
			}
			i++;
		}
		
	}
	
}
