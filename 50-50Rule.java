import java.util.*;
import java.lang.*;
import java.io.*;

class 50-50Rule
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     for(int i=0;i<t;i++)
	     {
	         int x=sc.nextInt();
	         int y=sc.nextInt();
	         if(x<50)
	         System.out.println("Z");
	         else if (y<50)
	         System.out.println("F");
	         else
	          System.out.println("A");
	     }

	}
}
