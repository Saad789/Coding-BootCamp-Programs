package JavaTutorial;

public class Arrays {

	public static void main(String[] args) {
		int marks[] = {75,94,62,85};
		int sum = 0;
		for(int counter = 0; counter < marks.length; counter++){
			System.out.println(marks[counter]);
			sum = sum + marks[counter];
			}
		System.out.println("Sum of marks: "+ sum);
       }

}
