package CoreJava6;

public class Honda extends Car
{
	Honda(String color, String make, int topSpeed, String year) {
		super(color, make, topSpeed, year);
		// TODO Auto-generated constructor stub
	}
	String feature(String color, int topSpeed)
	{
		return color;
	}
	String feature(String year)
	{
		return year;
	}
	String feature(String make, String color)
	{
		return make;
	}
	int feature(int topSpeed)
	{
		return topSpeed;
	}
}
