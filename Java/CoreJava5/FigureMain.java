package CoreJava5;

public class FigureMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle(10, 20);
		Triangle tri = new Triangle(15, 25);
		
		Figure fig = rec;
		System.out.println("Area of Rectangle: " + fig.area());
		
		fig = tri;
		System.out.println("Area of Triangle: " + fig.area());
	}

}
