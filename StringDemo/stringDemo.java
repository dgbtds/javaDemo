package StringDemo;

public class stringDemo {
	public static void main(String []args) {
		String str="a121duh1234er12re12";
		//DeleteSpace(str);
		//reverseStr(5,8,str);
		getSubstr("12duh123cdjifjaidfiadf12re12", str);
	}
	public static void getSubstr(String str1,String str2) {
		String Bstr,Sstr;
		if(str1.length()>str2.length()) {
			Bstr=str1;
			Sstr=str2;
		}
		else {
			Bstr=str2;
			Sstr=str1;
		}
		int start=0,end=Sstr.length(),count=0;
		boolean flag=true;
		while(flag){
			for(int i=0;i<=count;i++) {
				if(Bstr.contains(Sstr.substring(start+i, end-count+i))) {
					sop(Sstr.substring(start+i, end-count+i));
					flag=false;
				}
			}		
			count++;


		}

	}
	public static void countChar(String Dstr,String Rstr) {
		int count=0,cast=0;
		while(Rstr.indexOf(Dstr, cast)!=-1) {
			cast= Rstr.indexOf(Dstr, cast)+1;
			count++;
		}
		sop(count);
	}
	public static void reverseStr(int start,int end,String str) {
		if((start<str.length())&&(end<str.length())){
			char[] arr=str.toCharArray();
			for (int i = start-1; i < start+(end-start)/2; i++) {
				char temp=arr[i];
				arr[i]=arr[end+start-2-i];
				arr[end+start-2-i]=temp;
			}
			str=String.copyValueOf(arr);
			sop(str);
		}
		else {
			sop("error args!");
		}
	}
	public static void DeleteSpace(String str) {
		int start=0,end=str.length()-1;
		//		while(str.startsWith(" ")) {
		//			str=str.substring(1);
		//		}
		//		while(str.endsWith(" ")) {
		//			str=str.substring(0,str.length()-1);
		//		}
		//		sop(str);
		sop(start);
		sop(end);
		while(str.charAt(start)==' ') {
			start++;
		}
		while(str.charAt(end)==' ') {
			end--;
		}	
		str=str.substring(start,end+1);
		sop(start);
		sop(end);
		sop(str);

	}
	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
