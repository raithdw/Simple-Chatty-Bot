import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n % 2 + n / 2;
        int m = scanner.nextInt();
        int b = m % 2 + m / 2;
        int k = scanner.nextInt();
        int c = k % 2 + k / 2;
        System.out.println(a + b + c);
    }
}