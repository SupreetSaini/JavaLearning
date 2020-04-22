package wrapper;

public class ConversionStringToChar {

	public static void main(String[] args) {
		// String can be converted to character by using char() method
     String s=  "Harmohit";
     char c = s.charAt(0);
     System.out.println(c);
     
     // to print  full name
     
     String s1= "Harmohit";
     for(int i=0;i<s1.length();i++) {
    	 char c1 = s1.charAt(i);
    	 System.out.println(c1);
     }
    
	}

}
