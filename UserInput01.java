package JavaTutorial;

import java.util.Scanner;

public class UserInput01 {

public static void main(String[] args) {
		Scanner s2 = new Scanner(System.in);
		if(s2.hasNext()){
			String input = s2.nextLine();
			System.out.println(input);
		}
		else{
			System.out.println("Please enter a String value");
		}

	}

}
