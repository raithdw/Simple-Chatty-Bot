import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long m = input.nextLong();
        long n = 1;
        int count = 0;
        int i = 1;
        while (m >= n) {
            n = n * i;
            i++;
            count++;
        }

        System.out.println(count);
    }
}