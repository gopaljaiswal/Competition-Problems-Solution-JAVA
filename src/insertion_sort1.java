import java.util.Scanner;
public class insertion_sort1 {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=in.nextInt();
			}
			boolean flag=false;
			int value=arr[n-1];
			for(int i=n-2;i>=0 && value<=arr[i+1];i--){
					if(value<arr[i]){
						arr[i+1]=arr[i];
					}
					else
					{
						arr[i+1]=value;
					}
					display(arr);
					System.out.println();
			}
}
		static void display(int[] arr){
			for(int i=0;i<arr.length;i++){
				System.out.printf("%d ",arr[i]);
				
			}
		}

}
