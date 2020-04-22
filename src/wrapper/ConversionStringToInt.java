package wrapper;

public class ConversionStringToInt {

	public static void main(String[] args) {
		
		// convert String to int (String to primitive data type)
		//two ways to convert String to int
		// Conversion by using ParseInt way:-
		
		String s = "200";
		int i = Integer.parseInt(s);
		System.out.println(i);
		//  conversion by using valueOf Way:-
		String s1 = "30";
		int j = Integer.valueOf(s1);
		System.out.println(j);
		// even we cn add number while appling methods , such as
		int j1 = Integer.valueOf(i+10);
		System.out.println(j1);

	}

}
