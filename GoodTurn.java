
import java.util.*;
import java.lang.*;
import java.io.*;


class GoodTurn
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		 for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a + b > 6) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
		
		
	}
}
