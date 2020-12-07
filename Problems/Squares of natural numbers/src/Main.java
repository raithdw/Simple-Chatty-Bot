import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int square = 1;
        int count = 2;
        do {
            System.out.println(square);
            square = (int) Math.pow(count, 2);
            count++;
        } while (square <= n);
    }
}
