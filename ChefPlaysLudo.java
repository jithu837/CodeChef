import java.util.*;

class ChefPlaysLudo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int t = sc.nextInt();

        while (t-- > 0) {
            // Read the number rolled by Chef on the die
            int x = sc.nextInt();

            // Check if Chef rolled a 6
            if (x == 6) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
