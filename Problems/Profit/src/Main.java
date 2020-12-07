import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double m = input.nextDouble();
        double p = input.nextDouble();
        double k = input.nextDouble();
        int countYears = 0;

        while (m < k) {
            m = m + (p / 100) * m;
            countYears++;
        }
        System.out.println(countYears);
    }
}