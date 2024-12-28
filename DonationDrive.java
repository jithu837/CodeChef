import java.util.Scanner;
class DonationDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt(); 
            int X = scanner.nextInt(); 
            int remaining = N - X;
            System.out.println(remaining);
        }
        scanner.close();
    }
}
