import java.util.Scanner;

class HeatWave {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the highest recorded temperature and the temperature of the given day
        int X = scanner.nextInt(); // Highest recorded temperature
        int Y = scanner.nextInt(); // Temperature on a given day

        // Check if a new record high was created
        if (Y > X) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
