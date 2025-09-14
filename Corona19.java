import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] X = new int[N];
            for (int i = 0; i < N; i++) {
                X[i] = sc.nextInt();
            }
            
            int minInfected = Integer.MAX_VALUE;
            int maxInfected = Integer.MIN_VALUE;
            
            // Try starting infection from each person
            for (int start = 0; start < N; start++) {
                int count = 1;
                int left = start;
                int right = start;
                
                // Spread left
                while (left > 0 && X[left] - X[left - 1] <= 2) {
                    left--;
                    count++;
                }
                
                // Spread right
                while (right < N - 1 && X[right + 1] - X[right] <= 2) {
                    right++;
                    count++;
                }
                
                minInfected = Math.min(minInfected, count);
                maxInfected = Math.max(maxInfected, count);
            }
            
            System.out.println(minInfected + " " + maxInfected);
        }
        
        sc.close();

	}
}
