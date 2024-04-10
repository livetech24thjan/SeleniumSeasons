package apr10th;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {

	public static void main(String[] args) {
		
		Date d=new Date();
		
		System.out.println(d);
		
		//Wed Apr 10 09:40:19 IST 2024
		
		//04-10-2024 09:40:19
		
		//String pattern = "yyyy-MM-dd";
		String pattern="yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		String date = simpleDateFormat.format(new Date());
		
		System.out.println(date);
		
		//2024-04-10 09:44:06
		
		date=date.replace(":", "-");
		
		System.out.println(date);
		
		//2024-04-10 09-45-18

	}

}
