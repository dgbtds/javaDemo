//package Thread;
//
//public class ProducerConsumerDemo {
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
//	public synchronized void set(String name) {
//		while(flag)
//			try {
//				this.wait();
//			} catch (Exception e) {
//				// TODO: handle exception
//			}	
//		++count;
//		this.name=name+" 生产者#####"+count;
//		System.out.println(this.name);		
//		flag=true;
//		this.notifyAll();
//	}
//	public synchronized void out() {
//		while(!flag)
//			try {
//				this.wait();
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		System.out.println("    消费者&&&&&&&&&&&&&&"+count);
//		flag=false;
//		this.notifyAll();
//	}
//}
//class Producer implements Runnable{
//	private Resource res;
//	Producer(Resource res){
//		this.res=res;
//	}
//	public void run() {
//		while(true) {
//			res.set("商品");
//		}
//	}
//}
//class Consumer implements Runnable{
//	private Resource res;
//	Consumer(Resource res){
//		this.res=res;
//	}
//	public void run() {
//		while(true) {
//			res.out();
//		}
//	}
//}
//
//
//
//
//
//
//
