package wrapper;

public class ConversionCharToString {

	public static void main(String[] args) {
     // Conversion from char to string can be done by :- 
		//  String.valueOf(char);   OR  Character.toString(char) method 
		char c = 'H';
		String s = String.valueOf(c);
		System.out.println(s);
		
		// br using character.toString(char)
		
		char c1 = 's';
		String s1 = Character.toString(c1);
		System.out.println(c1);

	}

}
