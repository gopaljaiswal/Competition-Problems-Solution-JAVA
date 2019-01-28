import java.util.*;
public class Save_the_Prisoner {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			int M=in.nextInt();
			int K=in.nextInt();
			get(N,M,K);
		}
		in.close();
	}
	
	public static void get(int N,int M,int K){
		
				//int rem=M%N;
				//int s=(K+rem-1)%N;
				System.out.println(((K+M)-1-1)%N+1);
				
		
	}
}


//methd 1
/*public static void main(String[] args){
		Scanner in = new Scanner(System.in);
    int n  = in.nextInt();
    while(n-->0) {   
        long N = in.nextLong();
        long m = in.nextLong();
        long s = in.nextLong();
        long x = (m +s-1-1)%N+1;
        System.out.println(x);    
    }}
*/

//method 2
/*public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
long t=sc.nextLong();
for(int i=0;i<t;i++){
    long noOfprisoner=sc.nextLong();
    long noOfSweet=sc.nextLong();
    long startId=sc.nextLong();

    long result=(startId+noOfSweet-1)% noOfprisoner;    

        if(result ==0){
            System.out.println(noOfprisoner);
        }else{
            System.out.println(result);
        }
    }
}*/