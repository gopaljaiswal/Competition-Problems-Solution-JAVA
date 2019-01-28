import java.util.*;
/*public class Fair_Rations {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int loaves = 0;
		int carry = 0;
		for(int j=0;j<N;j++){
			int i=in.nextInt();
		    if((carry + i)%2==1 ) {
		        loaves += 2;
		        carry = 1;
		    } else
		        carry = 0;
		}
		
		if(carry==1){
		   System.out.println("NO");
		}else{
			System.out.println(loaves);}
		
		in.close();
	}
}*/

public class Fair_Rations {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int B[] = new int[N];
    int sum = 0;
    for(int B_i=0; B_i < N; B_i++){
        B[B_i] = in.nextInt();
        sum+=B[B_i];
    }

    int count = 0;
    if(sum % 2 == 1){
        System.out.println("NO");
    }
    else{
        for(int i = 0; i<N; i++){
            if(B[i] % 2 != 0){
                B[i] = B[i] + 1;
                B[i+1] = B[i+1] + 1;
                count+=2;
            }
         }
        System.out.println(count);
    }
}}
