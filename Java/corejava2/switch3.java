package corejava2;
import java.util.*;

public class switch3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("JS Java RDBMS");
        System.out.print("Enter Topic: ");
        String topic = scanner.nextLine();
        String sub = "";
        
        switch (topic) {
            case "JS":
            	System.out.println("1. JS variable \n2. ESC \n3. Promises");
                System.out.println("Enter Sub topic: ");
                String sub_topic = scanner.nextLine();
                switch (sub_topic) {
                    case "JS variable":
                        sub = "JS variable";
                        break;
                    case "ESC":
                        sub = "ESC";
                        break;
                    case "Promises":
                        sub = "Promises";
                        break;
                    default:
                    	System.out.println("Wrong Input");
                        break;
                }
                break;
            case "Java":
            	System.out.println("1. Core Java \n2. Multi Threading \n3. Swing");
                System.out.println("Enter Sub topic: ");
                String sub_topic1 = scanner.nextLine();
                switch (sub_topic1) {
                    case "Core Java":
                        sub = "Core Java";
                        break;
                    case "Multi Threading":
                        sub = "Multi Threading";
                        break;
                    case "Swing":
                        sub = "Swing";
                        break;
                    default:
                    	System.out.println("Wrong Input");
                        break;
                }
                break;
            case "RDBMS":
            	System.out.println("1. SQL \n2. Oracle \n3. MySQL");
                System.out.println("Enter Sub topic: ");
                String sub_topic2 = scanner.nextLine();
                switch (sub_topic2) {
                    case "SQL":
                        sub = "SQL";
                        break;
                    case "Oracle":
                        sub = "Oracle";
                        break;
                    case "MySQL":
                        sub = "MySQL";
                        break;
                    default:
                    	System.out.println("Wrong Input");
                        break;
                }
                break;
            default:
            	System.out.println("Wrong Input");
                break;
        }
        
        System.out.println("You have selected " + topic + " and " + sub + " as sub topic");
    }
}
