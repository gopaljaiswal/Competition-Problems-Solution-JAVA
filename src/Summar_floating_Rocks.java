import java.util.Scanner;
public class Summar_floating_Rocks {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int count=0;
			int x1=in.nextInt();
			int y1=in.nextInt();
			int x2=in.nextInt();
			int y2=in.nextInt();
			int m=(y2-y1)/(x2-x1);
			if(m==1){
				System.out.println((x2-x1-1));
			}else if(m>0 && m!=1){
				for(int x=x1;x<x2;x++){
					for(int y=y1;y<y2;y++){
						if((y-y1)-m*(x-x1)==0){
							count++;
						}
					}
				}
				System.out.println(count);
			}else if(m<0){
				for(int x=x1;x<x2;x++){
					for(int y=y1;y<y2;y--){
						if((y-y1)-m*(x-x1)==0){
							count++;
						}
					}
				}
				System.out.println(count);
			}
		}
		
	}

}
