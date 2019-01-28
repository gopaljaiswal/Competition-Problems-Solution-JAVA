import java.util.Scanner;
public class Perfect_Skyline {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] H=new int[N];
		for(int i=0;i<N;i++){
			H[i]=in.nextInt();
		}
		N=(N-1)/2;
		boolean flag=false;
		int i=0;
		while(i<N){
			int p=H[i+1]-H[i];
			int q=H[(2*N)-(i+1)]-H[(2*N)-i];
			if((p==q)&& (p>0) &&(q>0))
			{
				flag=true;
				//System.out.println("Perfect");
			}else{
				flag=false;
				break;
			}
			
			i++;
		}
		if(flag==true)
		{
			System.out.println("Perfect");
		}else if(flag==false){
			System.out.println("Not perfect");
		}
		in.close();
	}
}
