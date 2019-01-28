import java.util.Scanner;
public class Add_in_Array {
	static Scanner in=new Scanner(System.in);
	static int top=0;
	static int N=in.nextInt();
	static int[] A=new int[N];
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			int a=in.nextInt();
			A=push(a);
		}    
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
		System.out.println("enter element u want to pop");
		int b=in.nextInt();
		int p=pop(b);
		for(int i=0;i<p;i++){
			System.out.println(A[i]+" ");
		}
		for(int i=p+1;i<N;i++){
			System.out.println(A[i]+" ");
		}
	}
	public static int pop(int b){
		for(int i=0;i<N;i++){
			if(A[i]==b){
				return i;
			}
		}
		return 0;
	}
	
	public static int[] push(int a){
		A[top++]=a;
		return A;
	} 
}
