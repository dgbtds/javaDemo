package StringDemo;

public class stringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		StringBuffer sb1=sb.append(34).append("wert").insert(1, "@@");
		sop(sb1);
	}
	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
