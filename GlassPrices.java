import java.util.*;
import java.lang.*;
import java.io.*;

class GlassPrices
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();   
        int Y = scanner.nextInt();   
        if (Y <= 2 * X) {
            System.out.println("METAL");
        } else {
            System.out.println("PLASTIC");
        }
    }
}


	
