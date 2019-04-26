//package Thread;
//
//class SellTicket implements Runnable{
//	int ticketnum=1000;	
//	boolean flag =true;
//	Object obj=new Object();
//	public void run() {
//		if(flag) {
//			while(true){
//				synchronized(obj) 
//				{		
//					show();
//				}
//			}
//		}
//		else {
//			while(true)
//				show();
//		}
//	}
//	public synchronized void show() {
//		synchronized (obj) {
//			if(ticketnum>0) {
//				try {
//					Thread.sleep(10);
//				}
//				catch (Exception e) {
//					// TODO: handle exception
//				}
//				System.out.println(Thread.currentThread().getName()+" : "+ticketnum--);
//			}
//			
//		}
//	}
//}
//public class ThreadDemo {
//	public static void main(String []arges) {
//		SellTicket st=new SellTicket();
//		Thread threadA=new Thread(st,"---A---");	
//		Thread threadB=new Thread(st,"---b---");
//		threadA.start();
//		try {
//			Thread.sleep(50);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		st.flag=false;
//		threadB.start();
////		Thread threadc=new Thread(st,"---c---");
////		Thread threadd=new Thread(st,"---d---");		
////		threadc.start();
////		threadd.start();
//	}
//}
