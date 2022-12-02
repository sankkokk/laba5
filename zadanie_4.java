import java.util.Scanner;

import static java.lang.Math.*;

public class zadanie_4_laba_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввидите число:");
        double x = in.nextDouble();
        if (x < 5){
            double y;
            y = pow(sin(2), pow(x, 2));
            System.out.println("Y = " + y);
        }

        if (x > 5 & x < 10){
            double y;
            y = (cos(2 * x))/(pow(sin(x), 2));
            System.out.println("Y = " + y);
        }

        if (x > 10){
            double y;
            y = tan(x + 5*cos(PI));
            System.out.println("Y = " + y);
        }

        if (x == 5 || x == 10){
            double y;
            y = 1 - x + 5 * pow(x, 3);
            System.out.println("Y = " + y);

        }

    }
}
