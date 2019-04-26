package SystemDemo;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy:MM:dd:hh:mm:ss");
		sop(sdf.format(d));
		Calendar ts=Calendar.getInstance();
		//sop(ts);
		//sop(ts.get(Calendar.SECOND));
		for (int i = 2000; i < 2050; i++) {
			ts.set(i, 2,1);
			ts.add(Calendar.DAY_OF_MONTH, -1);
			int DoM=ts.get(Calendar.DAY_OF_MONTH);
			sop(i+"nian 2yue "+DoM+"tian");
		}
	
	}

	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
