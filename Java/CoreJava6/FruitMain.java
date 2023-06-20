package CoreJava6;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mango mango = new Mango("Yellow", 15.5);
		Apple apple = new Apple("Red", 20.5);
		
		System.out.println("Color of mango: " + mango.color());
		System.out.println("Average weight of mango: " + mango.averageWeight());
		System.out.println("Color of apple: " + apple.color());
		System.out.println("Average weight of apple: " + apple.averageWeight());
	}

}
