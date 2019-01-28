import java.util.Scanner;
public class decimal_to_binary {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int a=in.nextInt();
			get_result(a);
	}
}
	public static void get_result(int a){
		char[] A=new char[31];
		String str=Integer.toString(a,2);
		A=str.toCharArray();
		for(int i=0;i<31;i++){
			if(A[i]=='1'){
				A[i]=0;
			}else if(A[i]=='0'){
				A[i]=1;
			}
		}
		System.out.println(binaryToInt(A));
		
	}
	static int binaryToInt (char[] cA){
	    int result = 0;
	    for (int i = cA.length-1;i>=0;i--){ 
	        if(cA[i]=='1') 
	        result+=Math.pow(2, cA.length-i-1);
	    }
	    return result;
	}

}
