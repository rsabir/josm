package utils;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateUtils {


	public static String formatDate (String date, String initDateFormat, String endDateFormat) throws ParseException {

	    Date initDate = new SimpleDateFormat(initDateFormat).parse(date);
	    SimpleDateFormat formatter = new SimpleDateFormat(endDateFormat);
	    String parsedDate = formatter.format(initDate);
	    return parsedDate;
	}
}
