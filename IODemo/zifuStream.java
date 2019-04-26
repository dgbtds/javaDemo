package IODemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberInputStream;
import java.io.LineNumberReader;

public class zifuStream {
	public static void main(String[] args)  {

		BufferedWriter bw=null;
		LineNumberReader br=null;
		char[] buf=new char[100];
		try {
			bw=new BufferedWriter(new FileWriter("/home/wy/Desktop/ioDemo2.dat"));
			br=new LineNumberReader(new FileReader("/home/wy/Desktop/ioDemo.dat"));
			//int num=0;
			//			while((num=br.read(buf))!=-1){
			//				sop(new String(buf,0,num));
			//				bw.write(buf,0,num);
			//				bw.flush();
			//			}
			String line=null;
		
			while((line=br.readLine())!=null) {
				bw.write(line.toCharArray());
				bw.newLine();//readline 不包括换行符
				bw.flush();
				if(br.getLineNumber()==3) {
					br.readLine();
					bw.write("the fourth line");
					bw.newLine();
					bw.flush();
				}
			}

			bw.flush();

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				if(bw!=null)
					bw.close();
				if(br!=null)
					br.close();
			} 
			catch (Exception e) {
				// TODO: handle exception
			}
		}		


		Runtime rt=Runtime.getRuntime();
		Process p=null;
		try {
			p = rt.exec("/usr/bin/gedit /home/wy/Desktop/ioDemo.dat /home/wy/Desktop/ioDemo2.dat");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(p!=null)
			p.destroy();
	}

	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
