import java.util.Scanner;

class SuryaNamaskar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of yoga poses performed by Chef
        int N = scanner.nextInt();

        // Each round of Surya Namaskar consists of 12 poses
        int posesPerRound = 12;

        // Calculate the number of complete rounds performed
        int roundsCompleted = N / posesPerRound;

        // Output the result
        System.out.println(roundsCompleted);

        scanner.close();
    }
}
