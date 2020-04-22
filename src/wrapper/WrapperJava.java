package wrapper;

public class WrapperJava {

	public static void main(String[] args) {
		// approach 1 :- using constructor - primitive data type are wrapped by constructor
		// Integer that we use r class of primitive data type
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(200);
		Integer i3 = new Integer("100");
		System.out.println(i1+i2+i3 );
		System.out.println();
		//  Integer i4 = new Integer ("ten"); -- shows an exception during run time (java.lang.NumberFormatException)
		
		Float f1 = new Float (22.3);
		Float f2 = new Float (10.2);
		System.out.println(f1+f2);
		System.out.println();
		
		
		//2nd Approach  - by using valueof method
		Integer x1 = Integer.valueOf(10);
		Integer x2 = Integer.valueOf(20);
		Integer x3 = Integer.valueOf("10");
		System.out.println(x1+x2+x3);
		// Integer x4 =Integer.valueOf("ten"); -- shows a run time exception (java.lang.NumberFormatException)
		
		Float f3 = Float.valueOf("20.1");
		Float f4 = Float.valueOf("10.2");
		System.out.println(f3+f4);
		
		
		
		
          		
		

	}

}
