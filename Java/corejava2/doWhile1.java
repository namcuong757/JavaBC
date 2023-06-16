package corejava2;

public class doWhile1 {
	public static void main(String args[])
	{
		int start = 33;
		do {
			if(start % 3 == 0)
				System.out.println(start);
			start++;
		}while(start < 100);
	}
}
