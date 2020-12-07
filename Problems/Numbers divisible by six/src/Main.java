import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        int seq = input.nextInt();

        for (int i = 0; i < seq; i++) {
            int number = input.nextInt();
            if (number % 6 == 0) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}