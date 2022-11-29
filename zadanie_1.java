import java.util.Scanner;
import static java.lang.Math.*;

public class zadanie_11_laba5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 число");
        double ch1 = in.nextDouble();
        System.out.println("Введите 2 число");
        double ch2 = in.nextDouble();
        System.out.println(("Введите 3 число"));
        double ch3 = in.nextDouble();

        if (ch1 == ch2 || ch1 == ch3 || ch2 == ch3) {
            System.out.println("Есть равные числа");
            System.exit(0);
        } else {
            double m1 = max(ch1, ch2);
            double maxx = max(ch3, m1);
            double m2 = min(ch1, ch2);
            double minn = min(ch3, m2);
            double sr;

            if ((ch1 == maxx || ch1 == minn) & (ch2 == maxx || ch2 == minn)) {
                sr = ch3;
            } else if ((ch2 == maxx || ch2 == minn) & (ch3 == maxx || ch3 == minn)) {
                sr = ch1;
            } else {
                sr = ch2;
            }
            System.out.println(minn);
            System.out.println(sr);
            System.out.println(maxx);
        }
    }
}
