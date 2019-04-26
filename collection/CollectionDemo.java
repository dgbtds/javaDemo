package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class CollectionDemo {
//	public static void main(String[] args) {
//		ArrayList<Object> al=new ArrayList<Object>();
//		ArrayList<Object> all=new ArrayList<Object>();
//		ArrayList<Object> altemp=new ArrayList<Object>();
//
//		al.add("java01");
//		al.add("1");
//		al.add(2);
//		al.add(3);
//		al.add(4);
//
//		altemp.addAll(al);
//		sop(al);
//		all.add("java01");
//		al.retainAll(all);
//		altemp.removeAll(all);
//		sop("al="+al);
//		sop("altemp="+altemp);
//		//		Iterator<Object> it=altemp.iterator();//容器的内部类implements 迭代器接口,iterator()是获得内部类对象的方法
//		//		while(it.hasNext()) {
//		//			sop(it.next());
//		//		}
//		for(Iterator<Object>it=altemp.iterator();it.hasNext();) {
//			sop(it.next());
//		}
//		ListDemo.linklistDemo();
//	}
	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
class ListDemo{
	public static void ListRun() {
		ArrayList<Object>arl=new ArrayList<Object>();
		arl.add("java01");
		arl.add("java02");
		arl.add("java03");
		arl.add("java04");
		CollectionDemo.sop(arl);
		arl.add(1, "hello 1");
		CollectionDemo.sop(arl);
		CollectionDemo.sop(arl.indexOf("java04"));
		CollectionDemo.sop(arl.subList(1, 4));
	}
	public static void ListiteretorDemo(){
		ArrayList<Object>arl=new ArrayList<Object>();
		arl.add("java01");
		arl.add("java02");
		arl.add("java03");
		arl.add("java04");
		CollectionDemo.sop(arl);
		Iterator<Object> it=arl.iterator();//容器的内部类implements 迭代器接口,iterator()是获得内部类对象的方法
		while(it.hasNext()) {
			Object obj=it.next();
			if(obj.equals("java02"))
				it.remove();
			//CollectionDemo.sop(it.next());
		}
		CollectionDemo.sop(arl);
		ListIterator<Object>lit=arl.listIterator();
		while(lit.hasNext()) {
			Object obj=lit.next();
			if(obj.equals("java03"))
				lit.set("java$02");
				
			//CollectionDemo.sop(it.next());
		}
		CollectionDemo.sop(arl);
	}
	public static void linklistDemo() {
		LinkedList<Object> ll=new LinkedList<Object>();
		ll.add("@01");
		ll.add("@02");
		ll.add("@03");
		ll.add("@04");
		ll.addFirst("first");
		CollectionDemo.sop(ll);
	}
}













