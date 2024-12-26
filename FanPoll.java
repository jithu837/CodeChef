import java.util.*;

class FanPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values for A, B, and C
        int A = scanner.nextInt(); // Votes for Dhoni
        int B = scanner.nextInt(); // Votes for Rohit
        int C = scanner.nextInt(); // Votes for Kohli

        // Determine if Dhoni has the maximum votes
        if (A > B && A > C) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
