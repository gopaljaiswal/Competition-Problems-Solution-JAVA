import java.util.Scanner;
public class Prime_factor {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		//PFactor(N);
		in.close();

	/*public static void PFactor(int N){
		int i=2;
		if(N==1){
			return ;
		}else{
			while(N%i!=0){
				i++;
				System.out.println(i);
				PFactor(N/i);
			}
		}*/
		
	int i=2;
	while(N>1)
	  {
	   if(N%i == 0)
	    {
	     System.out.print(i+" ");
	     N=N/i;
	    }
	   else
	    i++;
	  }
	}
}
