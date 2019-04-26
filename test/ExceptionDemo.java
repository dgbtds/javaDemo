package test;

class FushuException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int value;
	public FushuException(String msg,int value) {
		super(msg);
		this.value=value;
	}
	public int  getValue() {
		return value;
	}
}
class div{
	private int a,b;
	div(int a,int b){
		this.a=a;
		this.b=b;
	}
	public int getResult()throws FushuException{
		if(b<0)
			throw new FushuException("/by fushu", b);
		return a/b;
	}
}

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			div Demodiv=new div(4, -1);
			System.out.println("result: "+Demodiv.getResult());
			
			
			}
		 catch (FushuException e) {
			// TODO: handle exception
			 e.printStackTrace();
			 System.out.println("被除数为负："+e.getValue());
			
		}		
	}
}
