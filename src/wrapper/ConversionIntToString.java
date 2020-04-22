package wrapper;

public class ConversionIntToString {

	public static void main(String[] args) {
		//We can convert int to String in java using String.valueOf() and Integer.toString() methods.
		//Alternatively, we can use String.format() method.
		
		//conversion using String.valueOf method:-
		int a= 10, b= 20;
       String s=  String.valueOf(a);
       String s1= String.valueOf(b);
       String s2 = String.valueOf(b);
       String s3 = String.valueOf(a);
       System.out.println(s);
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
       
       // conversion by using Integer.toString()method:-
       int c = 12;
       String s4 = Integer.toString(c);
       System.out.println(s4);
       System.out.println(c+100);
       System.out.println(s4+10); //String always concatenate
       
       // conversion by using String.format() method:-
       int d =10;
       String s5 = String.format("%d",d);
       System.out.println(s5);
     
       

	}

}
