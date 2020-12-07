import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            int n = input.nextInt();
            if (n == 0) {
                break;
            }
            if (n % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        } while (true);
    }
}