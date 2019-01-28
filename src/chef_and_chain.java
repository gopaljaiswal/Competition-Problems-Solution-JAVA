import java.util.Scanner;
public class chef_and_chain {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
		String str=in.next();
		check_chain(str);
		}
	}

	public static void check_chain(String str){
		char[] A;
		int m=0,n=0;
		A=str.toCharArray();
			for(int i=1;i<A.length;i=i+2){
				char p='+';
				if(p!=A[i-1]){
					m++;
				}
				if(p==A[i]){
					m++;
				}
			}
			for(int i=1;i<A.length;i=i+2){
				char p='-';
				if(p!=A[i-1]){
					n++;
				}
				if(p==A[i]){
					n++;
				}
			}
			if(m<n){
				System.out.println(m);}
			else{
				System.out.println(n);
			}
	}
}
