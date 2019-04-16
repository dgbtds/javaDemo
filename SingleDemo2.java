package SingleDemo;
/*
 * 
 * gof设计模式：单例 饿汉式
 */

public class SingleDemo2 {

	private SingleDemo2(){
		
	}
	private static SingleDemo2 instance=new SingleDemo2();
	public static SingleDemo2 getinstance() {
		System.out.println("creat instance succeed!");
		return instance;
	}

}
class dosingle2 {
	public static void main(String[] args) {
		SingleDemo2 single1=SingleDemo2.getinstance();
		SingleDemo2 single2=SingleDemo2.getinstance();
		System.identityHashCode(single2);
		System.out.println(single1.hashCode());
		
	}
}
