import java.util.Scanner;
public class Insert_sort_part1 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[]a=new int[N];
		for(int i=0;i<N;i++){
			a[i]=in.nextInt();
		}
			int t=a[N-1];
			for(int j=N-2;j>=0;j--){
				if(a[j]>=t){
					a[j+1]=a[j];
					display(a);
				}
				else{
					a[j+1]=t;
					break;
				}
			}
		display(a);
		}
	public static void display(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	}

