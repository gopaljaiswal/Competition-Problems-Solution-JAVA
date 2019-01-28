import java.util.Scanner;
public class Cut_stick {
	public static void main(String[] args){ 
	Scanner in=new Scanner(System.in);
	int N=in.nextInt();
	int[] a=new int[N];
	for(int i=0;i<N;i++){
		a[i]=in.nextInt();
	}
	length1(a);
	}
	public static void length1(int[] a){
		int[] b=new int[a.length];
		int t=0;
		for(int i=0;i<a.length;i++){
			if(a[i]!=0){
				b[t++]=a[i];
			}
		}
		System.out.println(t);
		if(t>1){
			int p=min_value(b);
			for(int i=0;i<t;i++){
				b[i]=b[i]-p;
			}
			length1(b);
		}
	}
	public static int min_value(int[] a){
		int t=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]<t && a[i]>0){
				t=a[i];
			}
		}
		return t;
	}
}
