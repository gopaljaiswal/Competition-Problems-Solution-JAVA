import java.util.Scanner;
public class Special_Multiple {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			get_multiple(N);
		}
	}
	public static void get_multiple(int N){
		int i=1;
		while(true){
			int s=convertToBinary(i,0)*9;
			if(s%N==0){
				System.out.println(s);
				break;
			}
			i++;
		}
	}
	public static int convertToBinary(int num,int binary) {
        if (num == 0 || num == 1) {
            return num;
        } 
        binary = convertToBinary(num / 2, binary);
        binary = binary * 10 + (num % 2);
        return binary;
    }
}
