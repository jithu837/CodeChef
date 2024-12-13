import java.util.*;
import java.lang.*;
import java.io.*;

class LuckyClover
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  
        int totalLeaves = 4 + 3 * (N - 1);
        System.out.println(totalLeaves);

	}
}
