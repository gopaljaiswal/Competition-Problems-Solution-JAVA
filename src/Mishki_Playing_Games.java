import java.util.*;
import java.io.*;
public class Mishki_Playing_Games {
	public static void main(String[] args) throws IOException{
	//	Scanner in=new Scanner(System.in);
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String str=bf.readLine();
		String[] p1=str.split(" ");
		int N=Integer.parseInt(p1[0]);
		int M=Integer.parseInt(p1[1]);
		int[] A=new int[N];
		String str1=bf.readLine();
		String[] p2=str1.split(" ");
		for(int i=0;i<p2.length;i++){
			A[i]=Integer.parseInt(p2[i]);
		}
		
		//System.out.println(N+" "+M);
		//for(int i=0;i<N;i++){
			//System.out.print(A[i]+" ");
		//}
		//System.out.println();
		for(int i=0;i<M;i++){
			String str3=bf.readLine();
			String[] p3=str3.split(" ");
			int l=Integer.parseInt(p3[0]);
			int r=Integer.parseInt(p3[1]);
			//System.out.println(l+" "+r);
			result(A,l,r);
		}
		//in.close();
	}
	
	public static void result(int[] A,int l,int r){
		boolean s=false;
		int sum=0;
		for(int i=(l-1);i<r;i++){
			int p=A[i];
			sum+=floor1(p);
		}
		if(sum%2!=0){
			System.out.println("Mishki");
		}else{
			System.out.println("Hacker");
		}
	}
	
	public static int floor1(int a){
		int i=0;
		int p=0;
		while(true){
			if((Math.pow(2,i))<=a && ((Math.pow(2,(i+1)))>a)){
				p=(i+1);
				break;
			}
			i=i+1;
		}
		return p;
	} 
}