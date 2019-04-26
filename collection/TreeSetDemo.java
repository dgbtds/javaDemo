package collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void countChart(String str) {
		TreeSet<String> hs=new TreeSet<String>(new mycompare());
		//TreeSet<Object> hs=new TreeSet<Object>();
		hs.add( "abcd");
		hs.add( "a");
		hs.add("acdsa");
		Iterator<String> it=hs.iterator();
		while(it.hasNext())
		{
			//person p1=(person)it.next();
			//CollectionDemo.sop(p1.getAge()+"..."+p1.getName());
			CollectionDemo.sop(it.next());
		}
	}
}
class mycompare implements Comparator<String >{
	public int compare(String str1,String str2) {
//		if(!((o1 instanceof String)&&(o2 instanceof String)))
//			throw new RuntimeException();
//		
//		String str1=(String)o1;
//		String str2=(String)o1;
		CollectionDemo.sop("str1:  "+str1);
		CollectionDemo.sop("str2:  "+str2);
		if(str1.length()>str2.length())
			return 1;
		if(str1.length()==str2.length())
			return str1.compareTo(str2);
		return -1;
	}
}
class person implements Comparable<Object>{
	private int age;
	private String name;
	public person(int age,String name) {
		// TODO Auto-generated constructor stub
		this.age=age;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public boolean equals(Object obj) {
		CollectionDemo.sop("use person.equals:");
		if(!(obj instanceof person))
			return false;
		else {
			person p=(person)obj;
			return this.name==p.name&&this.age==p.age;
		}
	}
	public int compareTo(Object obj) {
		if(!(obj instanceof person))
			throw new RuntimeException("不是学生对象");
		person p=(person)obj;
		if(this.age>p.age)
			return 1;
		if(this.age==p.age)
			return this.name.compareTo(p.name);
			return -1;
		
	}
}