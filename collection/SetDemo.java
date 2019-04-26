//package collection;
//
//import java.util.HashSet;
//import java.util.Iterator;
//
//public class SetDemo {
//	public static void main(String[] args) {
//			HashSet<person>hs=new HashSet<person>();
//			person p=new person(20, "lisi");
//			hs.add(p);
//			hs.add(new person(30, "zhangsan"));
//			hs.add(new person(24, "wew"));
//			hs.add(p);
//			//hs.add(new person(30, "zhangsan"));
//			//CollectionDemo.sop(hs.contains(new person(30, "zhangsan")));
//			//hs.remove(new person(20, "lisi"));
//			Iterator<person> it=hs.iterator();
//			while(it.hasNext())
//			{
//				person p1=(person)it.next();
//				CollectionDemo.sop(p1.getAge()+"..."+p1.getName());
//			}
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
//		
//		if(!(obj instanceof person))
//			return false;
//		else {
//			person p=(person)obj;
//			CollectionDemo.sop(this.name+"use person.equals:"+p.name);
//			return this.name==p.name&&this.age==p.age;
//		}
//	}
//	public int hashCode() {
//		CollectionDemo.sop(this.name+"....use hashcode():");
//		//CollectionDemo.sop("use hashcode():");
//		return this.name.hashCode()+age*34;
//		//return 20;
//	}
//}