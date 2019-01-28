import java.util.*;
public class Lecture_Notes {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int K=in.nextInt();
		String str=in.next();
		int[] frnd=new int[K];
		for(int i=0;i<K;i++){
			frnd[i]=in.nextInt();
		}
	//	System.out.println((int)'1'-48);
		boolean flga=false;
		for(int i=0;i<K;i++){
			int p=frnd[i];
			if(((int)str.charAt(p-1)-48)==0){
				flga=true;
				System.out.println("Yes");
				break;
			}
		}
		if(flga==false){
			System.out.println("NO");
		}
		in.close();
		
	}

}
