import java.util.Scanner; 
public class Cavity_Map {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		String[] A=new String[N];
		for(int i=0;i<N;i++){
				A[i]=in.next();
		}
		for(int j=1;j<N-1;j++){
			for(int i=1;i<N-1;i++){
					if((A[j-1].charAt(i)<A[j].charAt(i) && A[j+1].charAt(i)<A[j].charAt(i)) && (A[j].charAt(i-1)<A[j].charAt(i) && A[j].charAt(i+1)<A[j].charAt(i))){
						String str=A[j].replace(A[j].charAt(i), 'X');
						//System.out.println(A[j].charAt(i)+" "+str);
						A[j]=str;
					}
			}
		}
		for(int i=0;i<N;i++){
			System.out.println(A[i]);
		}
	}
}
