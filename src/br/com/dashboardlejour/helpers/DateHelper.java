package br.com.dashboardlejour.helpers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {
	
	
	public static String toDateTimeString(Date date) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		return dateFormat.format(date);
		
	}
	
	public static String toDateString(Date date) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		return dateFormat.format(date);
		
	}
	
	public static Date parseDate(String dateString) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		if(dateString.indexOf("-") != -1) {
			dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		}
		
		if(dateString.length() < 16) {
			dateString += " 00:00";
		}
		
		Date date = null;
		
		try {
			if(dateString.indexOf("NULL") == -1) {
				date = dateFormat.parse(dateString);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return date;
		
	}
	
}
