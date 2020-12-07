import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine().trim();
        String str2 = input.nextLine().trim();
        System.out.println(str1.replaceAll("\\s+", "").equalsIgnoreCase(str2.replaceAll("\\s+", "")));
    }
}
