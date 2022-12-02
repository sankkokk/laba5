import java.util.Scanner;
import static java.lang.Math.*;
public class zadanie_1_laba_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] arr = {-3, -2.5, -2, -1.5, -1, - 0.5, 0, 0.5, 1, 1.5, 2, 2.5, 3};
        for (double i : arr){
            if (i >= 0){
                double f;
                f = pow(( i - 3), 2);
                System.out.println("F = " + f);
            }

            else {
                double f;
                f = sin(i) - cos(i);
                System.out.println("F = " + f);
            }

        }

    }
}
