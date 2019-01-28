//import java.util.Arrays;
//import java.util.Scanner;
//public class Missing_Numbers {
//	public static void main(String[] args){.util.Scanner;
//		Scanner in=new Scanner(System.in);
//		int n=in.nextInt();
//		int[] A=new int[n];
//		for(int i=0;i<n;i++){
//			A[i]=in.nextInt();
//		}
//		int m=in.nextInt();
//		int[] B=new int[m];
//		for(int j=0;j<m;j++){
//			B[j]=in.nextInt();
//		}
//		int q=0,p=0,r=0;
//		int[] c=new int[m]; 
//		for(int i=0;i<n;i++){
//			int t=A[i];
//			for(int s=0;s<A.length;s++){
//				if(t==A[s]){
//					q++;
//				}
//			}
//			for(int j=0;j<B.length;j++){
//				if(t==B[j]){
//					r++;
//				}
//			}
//			if(q!=r){
//				c[p++]=t;
//			}
//			q=0;r=0;
//		}
//		int end=c.length;;
//		for(int i=0;i<end;i++){
//			for(int j=i+1;j<end;j++){
//				if(c[i]==c[j]){
//					int shiftleft=j;
//					for(int k=j+1;k<end;k++,shiftleft++){
//						c[shiftleft]=c[k];
//					}
//					end--;
//					j--;
//				}
//			}
//		}
//		for(int i=0;i<end-1;i++){
//			System.out.println(c[i]);
//		}
//}
//}