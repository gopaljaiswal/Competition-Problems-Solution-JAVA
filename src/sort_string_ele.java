import java.util.Arrays;

public class sort_string_ele{
    public static void main(String[] args)
    {
        String original = "edcba";
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println(sorted);
    }
}