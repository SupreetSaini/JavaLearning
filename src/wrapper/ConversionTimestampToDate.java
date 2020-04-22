package wrapper;

import java.sql.Timestamp;
import java.util.Date;

public class ConversionTimestampToDate {

	public static void main(String[] args) {
		
		//using getTime() method of java.sql.Timestamp class.using getTime() method of java.sql.Timestamp class.
		
		
      Timestamp ts = new Timestamp(System.currentTimeMillis());
      Date date = new Date (ts.getTime());
      System.out.println(date);

	}

}
