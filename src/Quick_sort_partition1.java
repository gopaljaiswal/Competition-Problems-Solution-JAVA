import java.util.*;
public class Quick_sort_partition1 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		@SuppressWarnings("rawtypes")
		List list1=new ArrayList();
		List list2=new ArrayList();
		for(int i=1;i<N;i++){
			if(A[i]<=A[0]){
				list1.add(A[i]);
			}else{
				list2.add(A[i]);
			}
		}
		for(int i=0;i<list1.size();i++){
		System.out.print(list1.get(i)+" ");}
		System.out.print(A[0]+" ");
		for(int i=0;i<list2.size();i++){
		System.out.print(list2.get(i)+" ");}
	}

}
