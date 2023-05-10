import java.text.SimpleDateFormat;
import java.util.Date;
public class SimpleDate
{
	public static void main(String arg[])
	{
		Date date=new Date();
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
		String strDate=formatter.format(date);
		System.out.println(strDate);
	}
}
