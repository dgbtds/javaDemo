package test;

 interface Inter {
	public static final int Num=3;
	public abstract void show();

}
class testshow implements Inter{
	public void show() {
		
	}
}
abstract class Student{
	public abstract void study();
	public void sleep() {
		System.out.println("tanzgheshui");
	}
}
class baseStudent extends Student{
	public  void study() {
		System.out.println("base Study");
	}
	public void sleep() {
		System.out.println("tanzgheshui");
	}
}
class AdvStudent extends Student{
	public  void study() {
		System.out.println(" Adv Study");
	}
	public void sleep() {
		System.out.println("zhangheshui");
	}
}
class dostudent{
	public void dosome(Student stu) {
		stu.study();
		stu.sleep();
	}
}
class Outer{
	private int x=3;
	static class Inner{
		int x=4;
		static void function() {
			int x=5;
		System.out.println("inner:"+x);//内部类自动有一个外部类名.this引用
		}
	}
	static void method() {
		 Inner.function();
	}
}
public class interDemo{
	//@SuppressWarnings("static-access")
//	public static void main(String[] args) {
//		testshow t=new testshow();
//		System.out.println(t.Num);
//		gettimeDemo runcodetime=new gettimeDemo();
//		runcodetime.gettime();
//	
		
//	baseStudent bs=new baseStudent();
//	bs.study();
//	bs.sleep();
//	AdvStudent as=new AdvStudent();
//	as.study();
//	as.sleep();
		
//		Outer.Inner out=new Outer().new Inner();
//		out.function();
//		Outer out=new Outer();
//		out.method();
//		Outer.Inner.function();
//	}
	
}


























