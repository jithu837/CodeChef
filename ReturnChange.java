import java.util.*;
import java.lang.*;
import java.io.*;

class ReturnChange
{
	public static void main (String[] args) throws java.lang.Exception
	{ 
	    Scanner sc=new Scanner(System.in);
	    int T=sc.nextInt();
	    while(T-->0){
	        int X=sc.nextInt();
	        int lower = (X / 10) * 10;       
            int upper = lower + 10;          
            int d1 = X - lower;
            int d2 = upper - X;
            int roundedCost;
            if (d1 < d2) {
                roundedCost = lower;   
            } else {
                roundedCost = upper;   
            }
            int change = 100 - roundedCost;
            System.out.println(change);
	    }
    sc.close();
	}
}
