import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        while (n != 0) {
            n = input.nextInt();
            count++;
        }
        System.out.println(count);
    }
}