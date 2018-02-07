package JavaTutorial;

public class IsPalindrome {

	public static void main(String[] args) {
		int number = 1221;
		System.out.println(is_palindrome(number));
	}
	public static int reverse(int number){
		int reverse_number = 0;
		while(number > 0){
			int remainder = number % 10;
		    reverse_number = reverse_number * 10 + remainder;
		    number = number / 10;
	        }  
		    return reverse_number;
     }
	
	public static boolean is_palindrome(int number){
		if(reverse(number) == number)
			return true;
			return false;
			}
    }
