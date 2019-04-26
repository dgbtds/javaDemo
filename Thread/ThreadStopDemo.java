package Thread;

public class ThreadStopDemo {
	public static void main(String[] args) throws InterruptedException{
//		Thread T1=new Thread(new stopthread());
//		Thread T2=new Thread(new stopthread());
//		T1.start();
//		T2.start();
	Thread T1=new Thread(new Join(),"thread1");
	
	T1.start();
	//T1.join();
	T1.setPriority(Thread.MAX_PRIORITY);
	new Thread() {
		public void run() {
			for (int i = 0; i<70; i++) {
				System.out.println(Thread.currentThread().toString()+"#####"+i);
			}
		}
	}.start();
	
	
	for (int i = 0; i < 80; i++) {
		System.out.println(Thread.currentThread().toString()+"@@@@@"+i);
	}
	}

}

 class stopthread implements Runnable{
		private boolean flag=true;
		public synchronized void run() {
			while(flag)
				try {
					System.out.println(Thread.currentThread().toString()+"wait()");
					wait();
				} catch (InterruptedException e) {
					// TODO: handle exception
					System.out.println("stopthread.interrupted()");
				}
		}
	}
class Join implements Runnable{
	//private boolean flag=true;
	public  void run() {
		for (int i = 0; i<70; i++) {
			System.out.println(Thread.currentThread().toString()+"...."+i);
		}
	}
}
