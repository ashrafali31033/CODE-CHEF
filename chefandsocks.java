import java.util.*;
class fire{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=b+c;
        if(d>=a)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
       
    }
}