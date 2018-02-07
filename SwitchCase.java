package JavaTutorial;

public class SwitchCase {

	public static void main(String[] args) {
		int age = 23;
        switch(age){
		case 40:
			System.out.println("congrats! You turned 40");
            break;
		case 50:
			System.out.println("Congrats! You turned 50");
			break;
		case 60:
			System.out.println("Congrats! You turned 60");
		default:
        	System.out.println("You are still Young!");
        	break;
        	}
        }
    }
