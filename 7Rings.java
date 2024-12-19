import java.util.Scanner;

public class 7Rings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            if(n*x>=10000 && n*x<=99999)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
    }
}
