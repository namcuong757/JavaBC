package CoreJava4;

public class MethodMain {

	public static void main(String[] args) {
		String[] ids = {"user003","user001","user004"};
		String[] passWords = {"123","456", "789"};
		long[] balances = {1542,8541,10254};
		int size = 3;
		Method1 app = new Method1(ids, passWords, balances, size);
		//app.intro();
		
		Method1 app1 = new Method1();
		app1.intro();
		// TODO Auto-generated method stub

	}

}
