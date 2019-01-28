import java.util.*;
public class Match_the_Shoes {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int K=in.nextInt();
		int M=in.nextInt();
		int N=in.nextInt();
		int O[]=new int[N];
		for(int i=0;i<N;i++){
			O[i]=in.nextInt();
		}
		
		int[] p=new int[M];
		for(int i=0;i<N;i++){
			p[O[i]]++;
		}
		
		int[] q=new int[M];
		for(int i=0;i<M;i++){
			q[i]=p[i];
		}
		
		/*for(int i=0;i<M;i++){
			System.out.println(i+"     "+q[i]);
		}
		System.out.print("\n\n\n");
		*/
		
		Arrays.sort(q);
		
	/*	for(int i=0;i<M;i++){
			System.out.println(i+"     "+p[i]);
		}
		System.out.print("\n\n\n");
	*/	
		Set<Integer> set=new HashSet<Integer>();
		for(int i = 0; i<q.length; i++){
	           set.add(q[i]);
	     }
		Object[] s=set.toArray();
		
	/*	for(int i=0;i<s.length;i++){
			System.out.println(i+"     "+s[i]);
		}
		System.out.print("\n\n\n");
		*/
		
		int count=0;
		for(int i=s.length-1;i>=0;i--){
			int s1=(int) s[i];
			for(int j=0;j<M;j++){
				if(count==K){
					break;
				}else if(s1==p[j]){
					System.out.println(j);
					count++;
				}
			}
		}
		in.close();
	}
}