import java.io.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Lighthouse {

    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        String[] str=new String[N];
        for(int i=0;i<N;i++){
        	str[i]=in.next();
        }
        //Random rand = new Random();
        int rand = ThreadLocalRandom.current().nextInt(0,N);
        System.out.println(rand);
    }
}