import java.util.*;
class fire{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a+b;
            if(c<=6)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
       
    }
}