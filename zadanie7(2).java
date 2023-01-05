import static java.lang.Math.*;
import java.util.Scanner;
public class zadanie_77_laba5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите z");
        double x = in.nextDouble();
        double z;
        if (x>=-4 & x<=4) {
            if (x < 0) {
                z = 3 * pow(pow(x, 2) - 1, 3) + (2 + sqrt(1 + exp(1) * pow(x, 2 * 3.14))) / (cos(x + 2 * pow(x, 4)));
                System.out.println("z = " + z);
            } else if (x > +0 & x <= 1) {
                z = 2 * cos(x) * exp(-2 * x) - sin(2 * x - exp(1));
                System.out.println("z =  " + z);
            } else {
                z = (2 * pow(sin(3 * x), 2) - tan(x)) / (cos(sin(pow(x, 3))) + 3 * x);
                System.out.println("z = " + z);
            }
        }
        else {
                System.out.println("What you say about my mum, MMM?");
        }
    }
}
