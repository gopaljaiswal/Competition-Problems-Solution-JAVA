import java.util.Scanner;
 public class Navi_and_his_company {		
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=Integer.parseInt(in.nextLine());
		for(int i=0;i<T;i++){
			 int count1=0;
			 int count2=0;
			 int N=Integer.parseInt(in.nextLine());
			 String[] A=new String[N];
			 for(int j=0;j<N;j++){
				 String str=in.nextLine();
				 if(str.equals("New Project"))
				 {
					 count2++;
				 }else
					 count1=count1+Integer.parseInt(str);
			}
			 System.out.println(count2-count1);
		}	
		//in.close();
	}

}