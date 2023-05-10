import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class SimpleDate2
{
	public static void main(String arg[])
	{
		Date date=new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String strDate=formatter.format(date);
		System.out.println("Date format with MM/dd/yyyy: "+strDate);
		
		formatter=new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		strDate=formatter.format(date);
		System.out.println("Date Format with dd-M-YYYY hh:mm:ss  : "+strDate);
		
		formatter=new SimpleDateFormat("dd MMMM yyyy");
		strDate=formatter.format(date);
		System.out.println("Date Format with dd MMMM yyyy  : "+strDate);
		
		formatter=new SimpleDateFormat("dd MMMM yyyy  zzzz");
		strDate=formatter.format(date);
		System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);
		
		formatter=new SimpleDateFormat("E,dd MMMM yyyy HH:mm:ss z");
		strDate=formatter.format(date);
		System.out.println("Date Format with E, dd MMMM yyyy HH:mm:ss z : "+strDate);
		
		
	}
}
