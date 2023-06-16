package coreJava3;

public class Method {
	int a,b,c;
	Method()
	{
		a = 2;
		b = 3;
		c = 4;
	}
	public int sum()
	{
		int result = a + b +c;
		return result;
	}
	public void product()
	{
		System.out.println("Product of " + a + " " + b +  " " + c + " is " + a*b*c);
	}
}
