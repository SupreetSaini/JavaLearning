package datetime;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CurrentDateTime {

	public static void main(String[] args) {
		//can be show by using diferent methods :- java.time.format.DateTimeFormatter class
		//java.text.SimpleDateFormat class
		//java.time.LocalDate class
		//java.time.LocalTime class
		//java.time.LocalDateTime class
		//java.time.Clock class
		//java.util.Date class
		//java.sql.Date class
		//java.util.Calendar class
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
		
		LocalDateTime now = LocalDateTime.now();
System.out.println(dtf.format(now));

// by SimpleDateFormat

SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
Date date = new Date();  
System.out.println(formatter.format(date));  

          // by using localDate class

System.out.println(java.time.LocalDate.now());  
                // using lacaltime class
System.out.println(java.time.LocalTime.now()); 
           // by using datetime method
System.out.println(java.time.LocalDateTime.now()); 




	}

}
