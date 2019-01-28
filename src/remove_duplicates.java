import java.util.Scanner;
public class remove_duplicates {
    public static void main(String args[]) throws Exception {
        Scanner in=new Scanner(System.in);
        int l =in.nextInt();
        int[] a = new int[l];
        for (int i = 0; i < l; i++) 
        {
            int el = in.nextInt();
            a[i] = el;
        }
        for (int i = 0; i < l; i++) 
        {
            for (int j = 0; j < l - 1; j++) 
            {
                if (a[j] > a[j + 1])
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        int b = 0;
        a[b] = a[0];
        for (int i = 1; i < l; i++)
        {
            if (a[b] != a[i])
            {
                b++;
                a[b]=a[i];
            }
        }
        int count=0;
        for (int i = 0; i <= b; i++)
        {
        	if(a[i]!='\0')
            count++;
        }
        System.out.print(count+" "+(l-count));
    }
}