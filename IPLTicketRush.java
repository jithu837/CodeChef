import java.util.*;
class IPLTicketRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int notAbleToBook = Math.max(0, N - M);
            System.out.println(notAbleToBook);
        }
        scanner.close();
    }
}
