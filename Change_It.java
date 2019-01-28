import java.util.Scanner;
public class Change_It {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			String S=in.next();
			String S1=in.next();
			get(S,S1);
		}
		in.close();
	}
	
	public static void get(String s, String s1){
		char[] A=s.toCharArray();
		char[] B=s1.toCharArray();
		int count=0;
		for(int i=0;i<A.length;i++){
			if(A[i]=='?'){
				A[i]=B[i];
				count++;
			}else if(A[i]=='0'){
				if(A[i]!=B[i]){
					
					A[i]=B[i];
				}
			}else if(A[i]=='1'){
				if(A[i]!=B[i]){
					
				}
			}
		}
	}
}