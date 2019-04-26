//package collection;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.LinkedList;
//
////模拟堆栈队列
//public class LinkedlistDemo {
//	public static void main(String[] args) {
////		queue arl=new queue();
////		arl.add("java01");
////		arl.add("java02");
////		arl.add("java03");
////		arl.add("java04");
////		while(!arl.isNull())
////		CollectionDemo.sop(arl.get());
//	
//		ArrayList<Object> arl=new ArrayList<Object>();
//		arl.add(new person(20, "lisi"));
//		arl.add(new person(20, "lzhangsan"));
//		arl.add(new person(40, "zhangsansi"));
//		arl.add(new person(20, "lisi"));
//		if(arl.contains(new person(20, "lisi")))
//			new person(10, "xiaoyun");
//			//arl.remove(new person(20, "lisi"));
//		Iterator<Object>it=arl.iterator();
//		
//		while(it.hasNext())
//		{
//			person p=(person)it.next();
//			
//			CollectionDemo.sop(p.getName()+"..."+p.getAge());
//		}
//		//CollectionDemo.sop(arl);
//	}
//}
//class queue{
//	private LinkedList<Object>ll;
//	public queue() {
//		// TODO Auto-generated constructor stub
//		ll=new LinkedList<Object>();
//	}
//	public void add(Object obj) {
//		ll.addFirst(obj);
//	}
//	public Object get() {
//		return ll.removeFirst();
//	}
//	public boolean isNull() {
//		return ll.isEmpty();
//	}
//}
//class person{
//	private int age;
//	private String name;
//	public person(int age,String name) {
//		// TODO Auto-generated constructor stub
//		this.age=age;
//		this.name=name;
//	}
//	public String getName() {
//		return name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public boolean equals(Object obj) {
//		CollectionDemo.sop("use person.equals:");
//		if(!(obj instanceof person))
//			return false;
//		else {
//			person p=(person)obj;
//			return this.name==p.name&&this.age==p.age;
//		}
//	}
//}