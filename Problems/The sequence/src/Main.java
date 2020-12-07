import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 1;
        int numb;
        int biggest = 0;
        while (count <= n) {
            numb = input.nextInt();
            if (numb % 4 == 0 && biggest < numb) {
                biggest = numb;
            }
            count++;
        }
        System.out.println(biggest);
    }
}