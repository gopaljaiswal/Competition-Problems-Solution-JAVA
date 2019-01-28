import java.util.Scanner;
import java.io.*;
public class Manasa_loves_Maths {
	static int t=0;
	public static void main(String[] args)throws Exception{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(ir);
		Scanner in1=new Scanner(System.in);
		int T=in1.nextInt();
		for(int i=0;i<T;i++){
		String str=in.readLine();
		permute(str);
		t=0;
		}
	}
	public static void permute(String input){
		int l=input.length();
		boolean[] used=new boolean[l];
		StringBuffer new_str=new StringBuffer();
		char[] ch=input.toCharArray();
		int p=doPermute(ch,new_str,used,input.length(),0);
		if(p>0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
	public static int doPermute(char[] in,StringBuffer new_str,boolean[] used,int l,int level){
		if(level==l){
			int p=Integer.parseInt(new_str.toString())%8;
			if(p==0){
				t++;
			}
	}
		for(int i=0;i<l;i++){
			if(used[i])
				continue;
			new_str.append(in[i]);
			used[i]=true;
			doPermute(in,new_str,used,l,level+1);
			used[i]=false;
			new_str.setLength(new_str.length()-1);
		}
		return t;
	}
}
