import java.util.*;
public class Combination_Lock {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int[] S=new int[5];
		for(int i=0;i<5;i++){
			S[i]=in.nextInt();
		}
		int[] D=new int[5];
		for(int i=0;i<5;i++){
			D[i]=in.nextInt();
		}
		int count=0;
		for(int i=0;i<5;i++){
			int forw=S[i],f=0;
			
			while(forw!=D[i]){
				if(forw==9){
					forw=-1;
				}
				forw++;
				f++;
			}
			
			int back=S[i],b=0;
			while(back!=D[i]){
				if(back==0){
					back=10;
				}
				back--;
				b++;
			}
			//System.out.println(f+"   "+b);
			if(f<=b){
				count+=f;
			}else{
				count+=b;
			}
		}
		System.out.println(count);
		in.close();
	}
}