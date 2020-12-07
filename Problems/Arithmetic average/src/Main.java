import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double sum = 0;
        int counter = 0;

        for (double i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                counter++;
            }
        }

        System.out.println(sum / counter);
    }
}