import java.util.*;
class free
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=b*c;
        int e=a-d;
        if(d>a)
        {
            System.out.println("-1");
        }
        else {
            System.out.println(e);
        }
    }
}