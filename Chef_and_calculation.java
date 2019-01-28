import java.util.*;
public class Chef_and_calculation {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			int[] T1=new int[N];
			for(int j=0;j<T1.length;j++){
				int N1=in.nextInt();
				int[] A=new int[N1];
				for(int k=0;k<N1;k++){
					A[k]=in.nextInt();
				}		
				Map<Integer, Integer> frequencyMap = findFrequency(A);
		        int[] S=printMap(frequencyMap);
		        int q=get(S,S.length,N1);
		        //System.out.print(q+" ");
		        T1[j]=q;
		        //System.out.print(T1[j]+" ");
			}
			//for(int h=0;h<T1.length;h++){
	        	//System.out.print(T1[h]+" ");
	        //}
			get1(T1);
		}
		in.close();
	}	
	
///////////////////////////////////////////////////////////////////////////////////////////
	public static void get1(int[] A){
		int max=Integer.MIN_VALUE,j=0;
		Set s1=new HashSet();
		for(int i=0;i<A.length;i++){
			s1.add(A[i]);
			if(A[i]>max){
				max=A[i];
				j=i;
			}
		}
		
		
		//System.out.println(s1.size());
		
		if(A.length==1){
			System.out.println("chef");
		}else if(s1.size()==1){
			System.out.println("tie");
		}else if(j==0){
				System.out.println("chef");
		}else{
				System.out.println(j+1);
		}	
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////
	   public static Map<Integer, Integer> findFrequency(int[] arr) {
	        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	        for (int i : arr) {
	            Integer val = map.get(i);
	            if (val != null) {
	                map.put(i, val + 1);
	            } else {
	                map.put(i, 1);
	            }
	        }
	        return map;
	    }
	   
/////////////////////////////////////////////////////////////////////////////////////////////	 
	    public static int[] printMap(Map<Integer, Integer> map) {
	    	int l=map.size(),t=0;
	    	int[] C=new int[l];
	        Iterator<Integer> iterator = map.keySet().iterator();
	        while (iterator.hasNext()) {
	            Integer key = iterator.next();
	            C[t++]=map.get(key);
	        }
	        return C;
	    }
	    
///////////////////////////////////////////////////////////////////////////////////////////////
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
					//	System.out.print(C[s1]);
				}
				//System.out.println(count1+"   "+count);
				
				if(count1==5){
					count+=2;
				}else if(count1==4){
					count+=1;	
				}else if(count1<4){
					break;
				}
			}
		return (count+N);
		}
}
//////////////////////////////////////////////////////////////////////////////////////////////////