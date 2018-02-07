package JavaTutorial;

public class UserException {

	public static void main(String[] args) {
		try{
			ageCheck(23);
		    }
		catch(Exception e){
			System.out.println("Exception occured : " + e);
		   }
		}
    public static void ageCheck(int age) throws InvalidAgeException{
    	if(age <= 0){
    		throw new InvalidAgeException("Please enter correct age");
    	    }
    	else
    		System.out.println("Your age is :" + age);
    	}
	}


