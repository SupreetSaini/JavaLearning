package wrapper;

import java.sql.Timestamp;
import java.util.Date;

public class ConversionDateToTimestamp {

	public static void main(String[] args) {
		// date can be converted into timestamp by using date.gettime(); method
		
		
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		System.out.println(ts);

	}

}
