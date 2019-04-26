//package Thread;
//
//public class DeadLockDemo {
//	public static void main(String[] args) {
//		//Object mylocka=new Object();
//		//Object mylockb=new Object();
//
//		mythread ta=new mythread(true);
//		mythread tb=new mythread(false);
//		Thread threadA=new Thread(ta);
//		Thread threadB=new Thread(tb);
//		threadA.start();
//		threadB.start();
//
//	}
//
//}
//class mythread implements Runnable
//{
//	private  boolean flag;
//	public static Object mylocka=new Object();
//	public static Object mylockb=new Object();
//	public mythread(boolean flag) {
//		// TODO Auto-generated constructor stub
//		this.flag=flag;
//		//this.mylocka=mylocka;
//		//this.mylockb=mylockb;
//	}
//	public void run() {
//		if(flag){
//			synchronized (mylocka) {
//				System.out.println(Thread.currentThread().getName() + ", 锁住了资源a");
//				try {
//					Thread.sleep(500);
//				} 
//				catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//				System.out.println(Thread.currentThread().getName() + ", 等待获取资源b");
//				synchronized (mylockb) {
//					System.out.println(Thread.currentThread().getName() + ", 获得资源b");
//				}
//			} 		
//		}
//		else {
//			synchronized (mylockb) {
//				System.out.println(Thread.currentThread().getName() + ", 锁住了资源b");
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				System.out.println(Thread.currentThread().getName() + ", 等待获取资源a");
//				synchronized (mylocka) {
//					System.out.println(Thread.currentThread().getName() + ", 获得资源a");;
//				}
//			}
//		}
//	}
//}
//
