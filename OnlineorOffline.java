import java.util.*;
import java.lang.*;
import java.io.*;

class OnlineorOffline
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		    int N=sc.nextInt();
		    int M=sc.nextInt();
		    double finalprice=N*0.9;
		    
		    if(finalprice<M){
		        System.out.println("ONLINE");
		        
		    }else if(finalprice>M){
		        System.out.println("DINING");
		    }else{
		        
		    
		    System.out.println("EITHER");
		}}

	}
}
