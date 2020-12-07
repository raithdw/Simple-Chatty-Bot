import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next().toUpperCase();
        System.out.println(str.charAt(0) == 'J');
    }
}