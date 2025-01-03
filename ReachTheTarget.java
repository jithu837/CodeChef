import java.util.Scanner;
class ReachTheTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            int requiredRuns = X - Y;
            System.out.println(requiredRuns);
        }
        scanner.close();
    }
}
