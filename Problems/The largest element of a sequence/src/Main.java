import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int max = n;
        while (n != 0) {
            n = input.nextInt();
            if (max < n) {
                max = n;
            }
        }
        System.out.println(max);
    }
}
