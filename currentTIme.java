package currentTime;

import java.text.SimpleDateFormat;
import java.util.Date;
public class currentTIme {

	public static void main(String[] args) {
		
		Date currentDate = new Date();
		System.out.println(currentDate);
		
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		System.out.println(timeFormat.format(currentDate));

		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(dateFormat.format(currentDate));
		
		SimpleDateFormat dayOfTheWeek = new SimpleDateFormat("EEEE");
		System.out.println(dayOfTheWeek.format(currentDate));
	}
	
	

}
