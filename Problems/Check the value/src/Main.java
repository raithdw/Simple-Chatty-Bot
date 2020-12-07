import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numb = scanner.nextInt();
        System.out.println(checkValue(numb));
    }

    public static boolean checkValue(int numb) {
        return numb > 0 && numb < 10;
    }
}