//import java.io.*;
import java.util.*;
public class Bon_Appetit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int K=in.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=in.nextInt();
        }
        int charged_cost=in.nextInt();
        A[K]=0;
        int cost=0;
        for(int i=0;i<N;i++){
            cost+=A[i];
        }
        
        int s=(int)cost/2;
        int final1=s-charged_cost;
        
        if(final1==0){  
            System.out.println("Bon Appetit");
        }else{
            System.out.println(final1);
        }     
        //in.close();
    }
}