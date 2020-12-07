import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(str.substring(num1, num2 + 1));
    }
}