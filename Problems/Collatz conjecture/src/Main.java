import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.print(number + " ");
        while (number != 1) {
            if (number % 2 == 0) {
                number = number / 2;
            }
            else number = number * 3 + 1;

            System.out.print(number + " ");
        }
    }
}