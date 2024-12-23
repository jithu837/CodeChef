import java.util.*;

class SweetsShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the initial amount of money and the number of laddus bought
        int x = sc.nextInt();
        int n = sc.nextInt();

        // Calculate remaining money after buying laddus
        int remainingMoney = x - (n * 10);

        // Calculate the number of jalebis that can be bought
        int jalebis = remainingMoney / 20;

        // Output the number of jalebis
        System.out.println(jalebis);
    }
}
