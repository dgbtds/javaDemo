package SystemDemo;

public class mathDemo {
	public static void main(String[] args) {
		sop(sswr(3,6.2345));
	}
	public static double sswr(int ws,double s) {
		double s1=s*Math.pow(10, ws);
		s1=Math.round(s1)/Math.pow(10, ws);
		return s1;
	}
	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
