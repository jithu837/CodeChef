import java.util.*;
import java.lang.*;
import java.io.*;

class BetterDeal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0)
		{
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=100-a;
		int d=200-2*b;
        if(c<d)
        System.out.println("First");
        else if (c==d)
        System.out.println("Both");
        else
        System.out.println("Second");
		}
	}
}
