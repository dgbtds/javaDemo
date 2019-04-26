package collectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fillDemo {
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("aiush");
		l.add("adsash");
		l.add("sush");
		l.add("sdfush");
		fill(l, 1, 3, "fill");
		Integer[]arr= {1,2,3};
		List<Integer> l2=Arrays.asList(arr);
		sop(l2.size());
	}
	public static void fill(List<String> l,int start,int end,String str) {
		for (int i = start; i < end; i++) {
			l.remove(i);
			l.add(i, str);
		}
		sop(l);
	}
	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
