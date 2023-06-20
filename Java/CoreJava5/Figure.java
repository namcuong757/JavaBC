package CoreJava5;

public abstract class Figure {
	int side1, side2;
	Figure(int side1, int side2)
	{
		this.side1 = side1;
		this.side2 = side2;
	}
	abstract int area();
}
