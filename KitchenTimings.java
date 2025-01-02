import java.util.Scanner;
class KitchenTimings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            int workingHours = Y - X;
            System.out.println(workingHours);
        }
    }
}
