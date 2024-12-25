import java.util.Scanner;

class OffByOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the two integers A and B
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        // Calculate the sum of A and B
        int sum = A + B;
        
        // Append '1' to the end of the sum and print the result
        System.out.println(sum + "1");
        
        scanner.close();
    }
}
