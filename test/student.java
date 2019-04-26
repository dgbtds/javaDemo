package test;

abstract class getTime{
	public void gettime() {
		long starttime=System.currentTimeMillis();
		runcode();
		long endtime=System.currentTimeMillis();
		System.out.println(" time of program :"+(endtime-starttime));
	}
	public abstract void runcode();
}
 class gettimeDemo extends getTime{
	public void runcode(){
		try {
			Thread.sleep(3);
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			//关闭资源
		}
	}
}