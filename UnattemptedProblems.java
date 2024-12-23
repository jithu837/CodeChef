import java.util.*;

class UnattemptedProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the total number of problems and the number of attempted problems
        int x = sc.nextInt(); // Total problems
        int y = sc.nextInt(); // Attempted problems

        // Calculate the number of un-attempted problems
        int unattempted = x - y;

        // Output the number of un-attempted problems
        System.out.println(unattempted);
    }
}
