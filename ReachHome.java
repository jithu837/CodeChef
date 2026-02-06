import java.util.*;
import java.lang.*;
import java.io.*;

class ReachHome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		int X=sc.nextInt();
		int Y=sc.nextInt();
		if(5*X>=Y) System.out.println("Yes");
		else System.out.println("No");
		}
	}
}
