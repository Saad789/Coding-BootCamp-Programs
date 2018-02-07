package JavaTutorial;

public class StringPalidrome {

	public static void main(String[] args) {
		String str = "ANNA";
        String rev = reverse(str);
        System.out.println(str.equals(str)); 
	}
	public static String reverse(String str){
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		return sb.toString();
	}

}
