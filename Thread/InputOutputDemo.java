//package Thread;
//public class InputOutputDemo {
//	public static void main(String[] args) {
//		res s=new res();
//		new Thread(new input(s)).start();
//		new Thread(new output(s)).start();
//	}
// }
//class res{
//	private String name;
//	private String sex;
//	public boolean flagInOut=true;
//	public  synchronized void set(String name,String sex) {
//		if(!flagInOut) {
//			try {
//				this.wait();
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
//		this.name=name;
//		this.sex=sex;
//		flagInOut=false;
//		this.notify();
//	}
//	public  synchronized void show() {
//		if(flagInOut) {
//				try {
//				this.wait();
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
//		System.out.println(name+"...."+sex);
//			flagInOut=true;
//			this.notify();
//	}
//}
//class input implements Runnable{
//	boolean flag1=true;
//	res r;
//	public input(res r) {
//		// TODO Auto-generated constructor stub
//		this.r=r;
//	}
//	public void run() {
//		while(true) {
//			if(flag1) {
//				r.set("Mike", "Man");
//				flag1=!flag1;
//			}
//			else {
//				r.set("丽丽", "女女女女女");
//				flag1=!flag1;
//			}
//		}
//	}
//}
//class output implements Runnable{
//	res r;
//	public output(res r) {
//		// TODO Auto-generated constructor stub
//		this.r=r;
//	}
//	public void run() {
//		while(true) {
//			r.show();
//		}
//	}
//}
//
