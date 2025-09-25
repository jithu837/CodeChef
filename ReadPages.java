import java.util.*;
import java.lang.*;
import java.io.*;

class ReadPages
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{ 
		    int N=sc.nextInt();
		  
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int maxPages=X*Y;
		      if(N<=maxPages){
		System.out.println("YES");
		      }
		      else{
		          System.out.println("NO");
		      }
}
	}
}
