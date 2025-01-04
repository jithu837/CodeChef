import java.util.Scanner;
class ApproximateAnswer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt(); 
        int Y = scanner.nextInt(); 
        int K = scanner.nextInt(); 
        int difference = Math.abs(X - Y);
        if (difference <= K) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
