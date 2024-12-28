import java.util.Scanner;
class TourOfKing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt(); 
            int M = scanner.nextInt(); 
            int totalPeople = (N * 5) + (M * 7);
            System.out.println(totalPeople);
        }
        scanner.close();
    }
}
