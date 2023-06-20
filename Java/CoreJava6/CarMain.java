package CoreJava6;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda newCar = new Honda("Red", "Honda", 120, "2020");
		
		System.out.println("Top Speed: " + newCar.feature(110));
		System.out.println("Color: " + newCar.feature("Red", 110));
		System.out.println("Year: " + newCar.feature(2021));
		System.out.println("Make: " + newCar.feature("Honda", "Red"));
	}

}
