import java.util.Scanner;
public class zadanie_5_laba5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x");
        double x = in.nextDouble();
        System.out.println("Введите y");
        double y = in.nextDouble();
        if (((y < (8*x)/3 + 14) & (x > -8 & x < -4) & (y > 12*x + 42)) || ((y < 12*x + 42) & (y > -6) & (y < -(4*x)/3 - 2)) || ((y > -(4*x)/3 - 2) & (y > -(8*x)/3 - (3.33)) & ( y < (4*x)/3 + (3.33)))) {
            System.out.println("Точка попала в фигуру слева");
        }
        else if (((y < -4*x +2) & (y < 20*x + 14) & (y > 2*x - 8)) || (( y < 2*x - 8 ) & ( y > (2*x)/5 + (6.4) & ( y < -6*x +4))) || (( y > -6*x +4) & ( y > (16*x)/3 - 13) & ( y < 2.5*x -4.5))) {
            System.out.println("Точка попала в фигуру справа");
        }
        else {
            System.out.println(" Точка не попала в область");
        }
    }
}

