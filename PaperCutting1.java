import java.util.*;
import java.lang.*;
import java.io.*;

class PaperCutting1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		    int N=sc.nextInt();
		    int K=sc.nextInt();
		    int chartpaper=(N / K) * (N / K);
		   
		        System.out.println(chartpaper);
		    
		}

	}
}
