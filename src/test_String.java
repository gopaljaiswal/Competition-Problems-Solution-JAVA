import java.util.Scanner;
public class test_String {
			public static void main(String[] args){
				Scanner in=new Scanner(System.in);
				String str=in.next();
				int L=in.nextInt();
				int R=in.nextInt();
			//	System.out.println(str.substring(L,R));
				type_2(str,L,R);
			}
			
			public static void type_2(String str,int C,int D){
				long p=0;
				for(int i=C-1;i<D;i++){
					for(int j=i+1;j<=D;j++){
						long sum=0;
							String a=str.substring(i,j);
						/*	System.out.println(Integer.parseInt(a)/3);
							for(int t=0;t<a.length();t++){
								sum+=a.charAt(t);
							}*/
							int M=Integer.parseInt(a);
							if(M%3==0){
								p++;
							}
							
						}
					}
				System.out.println(p);
			}
}
