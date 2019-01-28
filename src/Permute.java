import java.io.*;
public class Permute{
    public static void main(String args[])throws IOException
    {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String inp = obj.readLine();
        for(int i =0;i<inp.length();i++)
        {
            System.out.println(inp.charAt(i));
            recurse(inp,"" + inp.charAt(i));
        }        
    }
//////////////////////////////////////////////////////////////////////////////////////////    
    static String recurse(String inp,String  s)
    {
        if (s.length()==inp.length())
            return "";
        for (int i =0;i<inp.length();i++)
        {
            System.out.println(s + inp.charAt(i));
            recurse(inp, s + inp.charAt(i));
            
        }
        return "";
    }

}