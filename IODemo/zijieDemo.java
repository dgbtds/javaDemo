package IODemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class zijieDemo {
	public static void main(String[] args) throws IOException  {
		int []usetime=new int[20];
		for (int i = 1; i < 21; i++) {
			usetime[i-1]=(int)fileB(i);
		}
		for (int i = 0; i < usetime.length; i++) {
			sop(usetime[i]+"(1024*"+i+"):");
			for (int j = 0; j < usetime[i]; j++) {
				sop("*");
			}
			sop("\n");
		}
		//fileio();
	}
	public static long fileB(int i) throws IOException {
		BufferedInputStream Bis=new BufferedInputStream(new 
				FileInputStream("/home/wy/Desktop/ioDemo2.dat"));
		BufferedOutputStream Bos=new BufferedOutputStream(new 
				FileOutputStream("/home/wy/Desktop/javaStream/zijielilu.avi",true));
		//sop(Bis.available());
		byte[]temp=new byte[1024*i];
		long start=System.currentTimeMillis();
		while(Bis.available()!=0) {
			Bos.write(temp,0,Bis.read(temp));
		}
		long end=System.currentTimeMillis();
		//sop("bufferSize :1024*"+i+", copy usetime:"+(end-start));
		Bos.close();
		
		Bis.close();
		return end-start;
	}
	public static void fileio() throws IOException {
		FileInputStream Bis=new 
				FileInputStream("/home/wy/Desktop/javaStream/shot.avi");
		FileOutputStream Bos=new 
				FileOutputStream("/home/wy/Desktop/javaStream/zijielilu.avi");
		sop(Bis.available());
		byte[]temp=new byte[1024];
		long start=System.currentTimeMillis();
		while(Bis.available()!=0) {
			Bos.write(temp,0,Bis.read(temp));
		}
		long end=System.currentTimeMillis();
		sop("copy time:"+(end-start));
		Bos.close();
		
		Bis.close();
	}
	public static void sop(Object obj) {
		System.out.print(obj);
	}
}
