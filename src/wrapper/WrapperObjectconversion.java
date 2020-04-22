package wrapper;

public class WrapperObjectconversion {

	public static void main(String[] args) {
		// wrapper object converted to primitive data type
		Integer i1 = Integer.valueOf(20);
		Integer i2 = Integer.valueOf(25);
		int x = i1.intValue();
		double d = i1.doubleValue();
		long l = i1.longValue();
		float f= i1.floatValue();
		System.out.println(x+d+l+f);// value of x,d,l,f = 20;
		int y = i2.intValue();
		float f1 = i2.floatValue();
		long l1 = i2.longValue();
		double d1 = i2.doubleValue();
		System.out.println(y+f1+l1+d1);// value of y,l1,f1,d1 = 25;
		System.out.println(x+y);
		System.out.println(l+l1);
		
		// conversion of wrapper object to string type
		String s1 = i1.toString();
		String s2 = i2.toString();
		System.out.println(s1+s2);

	}

}
