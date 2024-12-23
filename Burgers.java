import java.util.*;

class Burgers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // Read patties and buns for each test case
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(Math.min(a, b));
        }
    }
}
