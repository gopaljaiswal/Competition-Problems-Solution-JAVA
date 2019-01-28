//import java.util.Scanner;
import java.io.*;
public class Finding_dinosaurs {
	public static void main(String[] args)throws Exception{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		boolean flag=false;
		int N=in.read();
		int K=in.read();
		int L=in.read();
		int Q=in.read();
		String[] str=new String[N];
		int[][] p=new int[N][K];
		for(int i=0;i<N;i++){
			str[i]=in.readLine();
			for(int j=0;j<K;j++){
			p[i][j]=in.read();
			}
		}
		for(int i=0;i<=Q;i++){
			int[] A=new int[K];
			for(int j=0;j<K;j++){
				A[j]=in.read();
			}
			for(int k=0;k<N;k++){
				int t=0;
				for(int s=0;s<K;s++){
					if(p[k][s]==A[s]){
						t++;
						flag=true;
					}else{
						flag=false;
					}
				}
				if(t==K && flag==true){
					flag=true;
					System.out.println(str[k]);
					break;
				}
			}
			if(flag==false){
				System.out.println("You cant fool me :P");
			}
		}
	}
}
