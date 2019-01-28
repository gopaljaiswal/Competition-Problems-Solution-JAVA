import java.util.Scanner;
public class The_Psychic_Type {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		int S=in.nextInt();
		int E=in.nextInt();
		
		if(check(A,S,E)==true){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		System.out.println(check(A,S,E));
		in.close();
	}

	public static boolean check(int[] A,int S,int E){
		boolean flag=false;
		try{
			int i=S;
			while(true){
				int q=A[i-1];
				if(q==E){
					flag=true;
					break;
				}
			i=A[q-1];
			}
		}
		catch(Exception e){
			flag=false;
		}
		return flag;
	} 
}
