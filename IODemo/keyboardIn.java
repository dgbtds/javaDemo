package IODemo;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class keyboardIn {
	public static void main(String[] args) throws IOException {

		ExceptionInfo(); 
		//kbIn2() ;
		//PtoTxt();
	}
	public static void kbIn2() throws IOException {
		//字节－字符转换流
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in) );
		String line=null;
		//字符－字节转换流
		BufferedWriter bout=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/home/wy/Desktop/javaStream/kbtoTxt.txt"),"UTF-8"));
		while(true) {
			if("over".equals((line=in.readLine())))
				break;
			else {
				bout.write(line);
				bout.newLine();
				bout.flush();
			}
		}
		bout.close();
		in.close();
	}
	public static void kbIn() throws IOException {
		InputStream in=System.in;
		byte[] temp=new byte[1024];
		int by,count=0;
		while(true) {
			by=in.read();
			temp[count++]=(byte)by;
			if(by==(int)'\n')
			{
				sop(new String(temp,0,count).toUpperCase());
				Arrays.fill(temp, (byte)' ');
				count=0;
			}
			if(by==(int)'r') {
				if(
						(temp[count-2]=='e')&&(temp[count-3]=='v')&&(temp[count-4]=='o')
						) {
					sop(new String(temp,0,count-4));
					break;
				}
			}
		}
	}

	public static void sop(Object obj) {
		System.out.println(obj);
	}
	public static void ExceptionInfo() {
		try {
			int a=5/0;
		} catch (Exception e) {
			// TODO: handle exception
			try {
				Date d=new Date();
				PrintStream ps=new PrintStream("/home/wy/Desktop/javaStream/Exception.log");
				System.setOut(ps);
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
				sop(sdf.format(d));
				System.getProperties().list(ps);
				e.printStackTrace(ps);
			
				
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	public static void PtoTxt() throws IOException {
		BufferedReader bis=new BufferedReader
				(new InputStreamReader(new FileInputStream("/home/wy/Desktop/javaStream/Shot.png")));
		BufferedWriter bw=new BufferedWriter
				(new FileWriter("/home/wy/Desktop/javaStream/Shot.txt")) ;
		char[]temp=new char[1024];
		int count=0;
		while((count= bis.read(temp))!=-1) {
			bw.write(temp,0,count);
			bw.flush();
		}
		bis.close();
		bw.close();
	}
}
