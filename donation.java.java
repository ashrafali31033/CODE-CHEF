import java.util.*;
import java.lang.*;
import java.io.*;

class fire
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++)
	    {
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        if(a==b){
	            System.out.println("0");
	              }
	        else if(a>b){
	            System.out.println(a-b);
	        }
	        else {
	            System.out.println(b-a);
	        }
	    }
	    
	

	}
}

