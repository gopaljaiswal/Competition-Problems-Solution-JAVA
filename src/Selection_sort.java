public class Selection_sort {
		public static void main(String[] args){
			int[] A={5,10,-4,9,1,0};
			int[] B=doSelectionsort(A);
			for(int i:B){
				System.out.print(i+" ");
			}
		}
		public static int[] doSelectionsort(int[] arr){
			for(int i=0;i<arr.length-1;i++){
				int index=i;
				for(int j=i+1;j<arr.length;j++){
					if(arr[j]<arr[index]){
						index=j;
				}}
					if(i!=index){
						int min=arr[index];
						arr[index]=arr[i];
						arr[i]=min;
					}
				}
			return arr;
		}
}
