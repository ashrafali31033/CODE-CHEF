import java.util.*;
class fire
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int c=100;
            int b=a-10;
            if(a>c)
            {
                System.out.println(b);
            }
            else
            {
                System.out.println(a);
            }
        }
    }
}