import java.io.*;
public class Terrible_Chandu {
	public static void main(String[] args) throws Exception{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int N=in.read();
		for(int i=0;i<N;i++){
			String str=in.readLine();
			for(int j=str.length()-1;j>=0;j--){
				System.out.print(str.length()+" "+str.charAt(j));
			}
		}
}}
