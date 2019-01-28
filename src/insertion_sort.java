//(correct)
import java.io.*;
import java.util.*;
public class insertion_sort {
    public static void insertion_sort(int[] ar)
    {       
    	int count=0;
    	for(int i=1;i<ar.length;i++){
    		int min=ar[i];
    		for(int j=i-1;j>=0 && ar[j]>min;j--){
    				ar[j+1]=ar[j];
    				ar[j]=min;
    				count++;
    		}
       	}
    	System.out.println(count);
    }  
       
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertion_sort(ar);                  
    } 
}


