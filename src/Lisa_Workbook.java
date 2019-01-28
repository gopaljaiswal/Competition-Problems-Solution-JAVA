import java.util.*;

public class Lisa_Workbook {
	
    public static void main(String[] args) {
    	
    Scanner in=new Scanner(System.in);
    
        int N=in.nextInt();
        int K=in.nextInt();
        
        int page=0,ques=0,count=0,chap=0;
        
        int A[]=new int[N];
        
        for(int i=0;i<N;i++){
            A[i]=in.nextInt();
            
            ++page;
            ++chap;
            ques=0;
            
            for(int j=1;j<=A[i];j++){
            	
        	   ++ques;
        	   if(K!=1 && ques>K && ques%K==1){
        		   ++page;
        	   }
        	 
        	   if(ques==page){
        		   count++;
        	   }
        	   
               //special case:-
        	   if(K==1 && ques%K==0){
        		   ++page;
        	   }
           }
        }
        System.out.println(count);
    }
}