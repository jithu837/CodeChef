import java.util.*;

class MovieSnacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the prices of popcorn, drink, and combo
        int x = sc.nextInt(); // Price of one bucket of popcorn
        int y = sc.nextInt(); // Price of one drink
        int z = sc.nextInt(); // Price of one combo (popcorn + drink)

        // Calculate the cost of buying individually
        int individualCost = (2 * x) + (3 * y);

        // Calculate the cost using combos and individually
        int comboCost = (2 * z) + y; // 2 combos and 1 additional drink

        // Calculate the minimum cost
        int minCost = Math.min(individualCost, comboCost);

        // Output the minimum cost
        System.out.println(minCost);
    }
}
