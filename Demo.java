/*class Demo{
    public static void main(String args[])
    {
        int a = 1;
        int b = 2;
        int c = 3;
        a |= 4;
        b >>= 1;
        c <<= 1;
        a ^= c;
        System.out.println(a + " " + b + " " + c);
    }
}*/
/*class Demo {
    public static void main(String args[]) {
        byte a[] = { 65, 66, 67, 68, 69, 70 };
        byte b[] = { 71, 72, 73, 74, 75, 76 };
        System.arraycopy(a, 1, b, 3, 0);
        System.out.print(new String(a) + " " + new String(b));
    }
}*/
/*class Demo
{
    public static void main(String args[])
    {
        int a=32;
        System.out.println(a>>2);
        String str;
        //str.e
    }
}*/
/*class Demo {
    public static void main(String args[])
    {
        int x , y = 3;
        x = 101;
        if (x != 101 && x / 0 == 2)
            System.out.println(y);
        else
            System.out.println(++y);
    }
}*/

/*class Demo{
        public static void main(String args[]) 
        {    
            char a[] = new char[10];
        for (int i = 0; i < 10; ++i) {
                a[i] = '1';
                System.out.print(a[i] + "" );
                i++;
            }
        } 
    }*/

/*class Demo{
    public static void main(String args[])
    {
        int var1 = 2;
        int var2 = ~var1;
        System.out.print(var1 + " " + var2);
    }
}*/
interface Parent
{
    public void run();
}
class Child implements Parent
{
    public void run()
    {
        System.out.println("HackerEarth");
    }
}
class Subclass extends Child
{
    public void run()
    {
        System.out.println("IndiaHacks");
    }
}
class Demo
{
    public static void main(String args[])
    {
     Parent sc= new Subclass();
        sc.run();
       Parent c=new Child();
         c.run();
}
}