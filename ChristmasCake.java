import java.util.Scanner;

public class ChristmasCake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input today's date
        int X = scanner.nextInt();

        // Calculate the number of practice cakes Chef will bake
        int cakes = 25 - X;

        // Output the result
        System.out.println(cakes);

        scanner.close();
    }
}
