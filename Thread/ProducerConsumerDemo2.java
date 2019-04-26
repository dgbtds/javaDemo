//package Thread;
//import java.util.concurrent.locks.*;
//public class ProducerConsumerDemo2 {
//	public static void main(String []arges) {
//		Resource r=new Resource();
//		Producer pro=new Producer(r);
//		Consumer con =new Consumer(r);
//		Thread t1 =new Thread(pro);
//		Thread t2 =new Thread(pro);
//		Thread t3 =new Thread(con);
//		Thread t4 =new Thread(con);
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
//	}
//
//}
//class Resource{
//	private String name;
//	private boolean flag=false;
//	private int count =0;
//	private Lock lock=new ReentrantLock();
//	private Condition cdt_pro=lock.newCondition();
//	private Condition cdt_con=lock.newCondition();
//	public  void set(String name) {
//		lock.lock();
//		try {
//			while(flag)
//				cdt_pro.await();
//			++count;
//			this.name=name+" 生产者#####"+count;
//			System.out.println(this.name);		
//			flag=true;
//			cdt_con.signal();
//		} 
//		catch(InterruptedException e){
//
//		}
//		finally {
//			// TODO: handle finally clause
//			lock.unlock();
//		}
//	}
//
//	public synchronized void out() {
//		lock.lock();
//		try {
//			while(!flag)
//				cdt_con.await();
//			System.out.println("    消费者&&&&&&&&&&&&&&"+count);
//			flag=false;
//			cdt_pro.signal();
//		} 
//		catch(InterruptedException e){
//
//		}
//		finally {
//			// TODO: handle finally clause
//			lock.unlock();
//		}
//	}
//}
//	class Producer implements Runnable{
//		private Resource res;
//		Producer(Resource res){
//			this.res=res;
//		}
//		public void run() {
//			while(true) {
//				res.set("商品");
//			}
//		}
//	}
//	class Consumer implements Runnable{
//		private Resource res;
//		Consumer(Resource res){
//			this.res=res;
//		}
//		public void run() {
//			while(true) {
//				res.out();
//			}
//		}
//	}
//
//
//
//
//
//
//
