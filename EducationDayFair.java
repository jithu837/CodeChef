import java.util.Scanner;
class EducationDayFair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int chefSales = A * C;
        int chefinaSales = B * C;
        int maxSales = Math.max(chefSales, chefinaSales);
        System.out.println(maxSales);
        scanner.close();
    }
}
