package CoreJava4;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Method1 {
	private String[] ids;
	private String[] passWords ;
	private long[] balances;
	private int size;
	
	public Method1() 
	{
		size = 2;
		ids = new String[] {"user001", "user002"};
		passWords = new String[] {"123456", "1234"};
		balances = new long[]{1725, 5820};
	}
	
	public Method1(String[] ids, String[] passWords, long[] balances, int size) {
		this.ids = ids;
		this.passWords = passWords;
		this.balances = balances;
		this.size = size;
	}
	
	public void intro() {
		int conti = 0;
		int flag = 0;
		
		System.out.println("Online Banking Application");
		System.out.println("====================");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello...What is your name?");
		String name = scanner.nextLine();
		
		System.out.println("Hello " + name + "! How are you today?" );
		do {
			System.out.println("\n$$$$$$$$$$$$$ Online Banking $$$$$$$$$$$$$\n" );
			System.out.println("Would you like to view your balance?" );
			System.out.println("Enter your userID:" );
			String user = scanner.nextLine();
			System.out.println("Enter your password:" );
			String pass = scanner.nextLine();
			
			System.out.println("----LOGGING IN...");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			for(int i = 0; i < size; i++) {
				if(ids[i].equals(user) && passWords[i].equals(pass)) {
					System.out.println("---Successfully Logging In---" );
					System.out.println("Would you like to view your balance?");
					System.out.println("1. Yes\n2. No");
					System.out.println("Enter your choice");
					int choice = scanner.nextInt();
					
					switch(choice) {
						case 1: 
							System.out.println("Your current balance: $" + balances[i]);
							break;
						case 2:
							break;
						default:
							System.out.println("Invalid answer");
					}
					
					flag = 1;
					break;
				}
			}
			
			if(flag == 0) {
				System.out.println("====Failed to log in====\n");
			}
			
			System.out.println("Would you like to view another account?\n1. Yes\n2. No");
			System.out.println("Enter your choice");
			conti = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character
		} while(conti != 2);
		System.out.println("Thank you for using Online Banking");
	}
}
