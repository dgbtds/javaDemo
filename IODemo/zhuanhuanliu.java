package IODemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class zhuanhuanliu {
	public static void main(String[] args) throws IOException {
		
		kbIn2() ;
	}
	public static void kbIn2() throws IOException {
		//字节－字符转换流
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in) );
		String line=null;
		//字符－字节转换流
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/home/wy/Desktop/javaStream/kbout.dat")));
		while(true) {
			if("over".equals((line=in.readLine())))
				break;
			else {
				out.write(line);
				out.newLine();
				out.flush();
				
			}
			
		}
		
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
}
