import java.util.Scanner;
import static java.lang.Math.*;
public class zadanie_7_laba5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x");
        double x = in.nextDouble();
        double g;
        if (x >= -4 & x<=4) {
            if (x<=0) {
                g =(abs(3*pow(x,2)-6*x))/(1+2*x+pow(x,2));
                System.out.println("g = " + g);
            }
            else if (x > 0){
                g = (exp(cos(x*sin(x)))) * (abs(pow(x,2)-2)/cos(x-2));
                System.out.println("g = " + g);
            }

        }
        else {
            System.out.println("All my homies don't like this shit");
        }
    }
}
