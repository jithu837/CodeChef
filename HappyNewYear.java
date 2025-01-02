import java.util.Scanner;
class HappyNewYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int hoursLeft = 24 - X;
        System.out.println(hoursLeft);
        scanner.close();
    }
}
