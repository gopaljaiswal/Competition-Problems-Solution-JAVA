
public class Count_Array {
	public static void main(String[] args){
		int[] A={3,3,3,4,4,4,5,5,5,6,6,6};
		System.out.println(get(A,A.length,12));
	}	
	
	public static int get(int C[], int n,int N){
		
		int count=0;	
		for(int y=0;y<C.length;y++){
			int	count1=0;
			for(int s=0;s<C.length;s++){
				if(C[s]>0){
					count1++;
				}		
				if(count1==6){
					count+=4;
					break;
				}
			}
			for(int s1=0;s1<n;s1++){
				if(C[s1]!=0){
					C[s1]=C[s1]-1;
				}
			}
			for(int s1=0;s1<n;s1++){
					System.out.print(C[s1]);
			}
			System.out.println(count1+"   "+count);
			
			if(count1==5){
				count=count+2;
			}else if(count1==4){
				count=count+1;	
			}
			if(count1<4){
				break;
			}
		}
	return (count+N);
	}
}