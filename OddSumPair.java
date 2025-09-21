import java.util.*;
import java.lang.*;
import java.io.*;

class OddSumPair
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner (System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		    int A=sc.nextInt();
		    int B=sc.nextInt();
		    int C=sc.nextInt();
		    boolean hasOdd = (A % 2 != 0) || (B % 2 != 0) || (C % 2 != 0);
            boolean hasEven = (A % 2 == 0) || (B % 2 == 0) || (C % 2 == 0);
		    if(hasOdd && hasEven)
		    {
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
	    }
	    
	}
}
