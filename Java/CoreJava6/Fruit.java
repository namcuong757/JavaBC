package CoreJava6;

public class Fruit {
	private String color;
	private double weight;
	Fruit(String color, double weight)
	{
		this.color = color;
		this.weight = weight;
	}
	
	public String color()
	{
		return color;
	}
	public double averageWeight()
	{
		return weight;
	}
}
