package JavaTutorial;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		if(s1.hasNext())
		{
		int input = s1.nextInt();
		System.out.println(input);
       }
		else{
			System.out.println("Please enter an integer value");
		}
     }
}
