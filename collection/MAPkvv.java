package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class MAPkvv {
	public static void main(String[] args) {
		HashMap<String, String>yure=new HashMap<String, String>();
		HashMap<String, String>jiuye=new HashMap<String, String>();
		HashMap<String, HashMap<String, String>>CZBK=new HashMap<String, HashMap<String, String>>();
		yure.put("01", "lisi");
		yure.put("02", "zhangsan");
		jiuye.put("01", "lasai");
		jiuye.put("02", "lewr");
		CZBK.put("yureban", yure);
		CZBK.put("jiuyeban", jiuye);
		Iterator<String> it=CZBK.keySet().iterator();
		while(it.hasNext()) {
			String roomname=it.next();
			sop("roomname : "+roomname);
			getstudent(CZBK.get(roomname)) ;
			//Collections.swap(list, i, j);
		}
		
	}
	public static void getstudent(HashMap<String, String>room) {
		Iterator<String>it=room.keySet().iterator();
		while(it.hasNext()) {
			String id=it.next();
			String name=room.get(id);
			sop(id+" : "+name);
		}
	}
	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
