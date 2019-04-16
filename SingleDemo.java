package SingleDemo;
/*
 * 
 * gof设计模式：单例懒汉式,延时加载
 */

public class SingleDemo {
	private static SingleDemo instance=null;
	private SingleDemo(){}
	
	public static SingleDemo getinstance() {
		System.out.println("creat instance succeed!");
		if(instance==null) {
			synchronized(SingleDemo.class) {
				    if(instance==null)
					instance=new SingleDemo();
			}
		}		
		return instance;
	}
	public static void main(String[] args){
		
	}
}
class dosingle {
	public static void main(String[] args) {
		SingleDemo single1=SingleDemo.getinstance();
		SingleDemo single2=SingleDemo.getinstance();
		
		
	}
}
