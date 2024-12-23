import java.util.*;

class LeadGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int player1CumulativeScore = 0;
        int player2CumulativeScore = 0;
        int maxLead = 0;
        int winner = 0;
        // Process each round
        for (int i = 0; i < n; i++) {
            int player1Score = sc.nextInt();
            int player2Score = sc.nextInt();
            player1CumulativeScore += player1Score;
            player2CumulativeScore += player2Score;
            int currentLead = Math.abs(player1CumulativeScore - player2CumulativeScore);
            int currentLeader = player1CumulativeScore > player2CumulativeScore ? 1 : 2;
            if (currentLead > maxLead) {
                maxLead = currentLead;
                winner = currentLeader;
            }
        }

        // Output the winner and the maximum lead
        System.out.println(winner + " " + maxLead);
    }
}
