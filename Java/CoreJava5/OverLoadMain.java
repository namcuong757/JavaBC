package CoreJava5;

public class OverLoadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadMethod1 a = new OverLoadMethod1();
		OverLoadSub b = new OverLoadSub();
		a.sum();
		System.out.println(b.sum(10,100));
		System.out.println("======================");
		a.sum(5);
		System.out.println(b.sum(10,100,15));
	}

}
