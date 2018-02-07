package JavaTutorial;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a = 25;
		int b = 10;
		System.out.println(divide(a,b));
       }
	public static int divide(int a,int b){
		 int result = 0;
		 try{
			 result = a / b;
		 }
		 catch(Exception e){
			 System.out.println("Invalid calculation");
		
		 }
		  return result;
		
	}

}
