package CoreJava5;

public class OverLoadMethod1 {
	int i = 10, j = 20;
	
	public void sum()
	{
		int result = i + j;
		System.out.println("Sum: " + result);
	}
	public void sum(int c)
	{
		int result = i + j + c;
		System.out.println("Sum: " + result);
	}
}
