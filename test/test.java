package test;

public class test {
//	public static void main(String[] args)
//	{
//		new maintest(4,20,"zhangsan");
//	}
		

}
class maintest{
	int age;
	String name;
	maintest()
	{
		System.out.println("a");
	}
	{
		System.out.println("b"+",age="+age+",name="+name);
	}
	static {
		System.out.println("c");
	}
	maintest(int q,int age,String name)
	{		
		this.age=age;
		this.name=name;
		System.out.println(q+",age="+age+",name="+name);
	}
	public static void show() {
		System.out.println("show run");//
	}
}
