package CoreJava5;

public class Triangle extends Figure
{

	Triangle(int side1, int side2) {
		super(side1, side2);
		// TODO Auto-generated constructor stub
	}

	//@Override
	int area() {
		// TODO Auto-generated method stub
		return (side1 * side2) / 2;
	}

}
