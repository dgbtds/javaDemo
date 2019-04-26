package SystemDemo;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class sysDemo {
	public static void main(String[] args) throws IOException {
		Properties prop=System.getProperties();
		System.setProperty("MYKEY", "MYVALUE");
		Iterator<Map.Entry<Object, Object>>it=prop.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Object, Object>me=it.next();
			//sop("key: "+me.getKey()+"******value: "+me.getValue());
		}
		
		Runtime rt=Runtime.getRuntime();
		sop("freeMemory:"+rt.freeMemory()/1024/1024+"KB");
		Process p=rt.exec("/home/wy/Qt5.10.1/Tools/QtCreator/bin/qtcreator");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.destroy();
	}
	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
