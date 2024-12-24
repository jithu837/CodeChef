import java.util.Scanner;

class DetermineScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int T = sc.nextInt();
        
        // Iterate over each test case
        for (int t = 0; t < T; t++) {
            // Read X (total points for the problem) and N (number of test cases Chef passed)
            int X = sc.nextInt();
            int N = sc.nextInt();
            
            // Calculate points per test case
            int pointsPerTestCase = X / 10;
            
            // Calculate the score for Chef
            int score = pointsPerTestCase * N;
            
            // Output the result
            System.out.println(score);
        }
        
        sc.close();
    }
}
