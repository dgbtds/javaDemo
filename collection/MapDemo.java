package collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		String str="asudhqihdoqnhcxoqinhoi";
		countChart(str);
		
	}
	public static void countChart(String str) {
		char[]sb=str.toCharArray();
		TreeMap<Character, Integer>  zifucount=new TreeMap<Character, Integer>();
		int count=0;
		for (int i = 0; i < sb.length; i++) {
			Integer value=zifucount.get(sb[i]);
			
			if(value!=null)
				count=value;
			count++;
				zifucount.put(sb[i],count);
				count=0;
			
		}
		Set<Map.Entry<Character, Integer>>ts=zifucount.entrySet();
		Iterator<Map.Entry<Character, Integer>>it=ts.iterator();
		while(it.hasNext()) {
			Map.Entry<Character, Integer>me=it.next();
			sop(me.getKey()+"("+me.getValue()+")");
		}
	}
	public static void sop(Object obj) {
		System.out.print(obj);
	}
}
