package wrapper;


import java.text.SimpleDateFormat;
import java.util.Date;

public class ConversionStringToDate {

	public static void main(String[] args) throws Exception{
		String sDate1 = "19/04/2020";
		Date date1 = new SimpleDateFormat("dd/mm/yyyy").parse(sDate1);
		
		
		String sDate = null;
		System.out.println(date1);
		
		
		//OR
		String sDate2 = "19/04/2020";
		String sDate3 = "02/10/2020";
		String sDate4 = "11/02/2020";
		String sDate5 = "04/21/2020";
		String sDate6 = "16/09/2020";
		String sDate7 = "31-Dec-1998";
		Date date2 = new SimpleDateFormat("dd/mm/yyyy").parse(sDate2);
		Date date3 = new SimpleDateFormat("dd/mm/yyyy").parse(sDate3);
		Date date4 = new SimpleDateFormat("mm/dd/yyyy").parse(sDate4);
		Date date5 = new SimpleDateFormat("mm/dd/yyyy").parse(sDate5);
		Date date6 = new SimpleDateFormat("dd/mm/yyyy").parse(sDate6);
		Date date7 = new SimpleDateFormat("dd-MMM-yyyy").parse(sDate7);
		System.out.println(date2);
		System.out.println(date3);
		System.out.println(date4);
		System.out.println(date5);
		System.out.println(date6);
		System.out.println(date7);
		
		

	}

}
