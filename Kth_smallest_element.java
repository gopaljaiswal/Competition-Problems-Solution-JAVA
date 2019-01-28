import java.util.*;
public class Kth_smallest_element {
public static void main(String[] args){
	int[] A={7,9,5,6,1,3,99,67};
	System.out.println(GetKthSmallestItem(A,3));
	
}
	
	public static int GetKthSmallestItem(int[] array, int k)
    {
        //Current rank of smallest value
        int currentRank = 1;
        //Store first value as smallest value for rank 1
        int KthSmallValue = array[0];

        //Loop through array starting from 2nd element
        for (int i = 1; i < array.length; i++)
        {
            //If next array element is greater then one 
            //and current rank is not yet equal to k then
            //replace kthSmallValue and increement currentRank
            if (KthSmallValue < array[i])
            {
                if (currentRank < k)
                {
                    KthSmallValue = array[i];
                    currentRank++;
                }
            }
            //If next array element is smaller then kthSmallValue 
            //then adjust kthSmallValue with last max value
            else
            {
                int MaxValue = array[i];
                for (int j = 0; j < i; j++)
                {
                    if (MaxValue < array[j] && (currentRank<k || KthSmallValue > array[j]))
                    {
                        MaxValue = array[j];
                    }
                }

                if (MaxValue >= KthSmallValue)
                    currentRank++;

                KthSmallValue = MaxValue;
            }
        }
        return KthSmallValue;
    }
	
}
