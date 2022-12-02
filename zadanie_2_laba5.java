import java.util.Scanner;
public class zadanie_2_laba5 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.println("Введите a");
        double a = in.nextDouble();
        System.out.println("Введите b");
        double b = in.nextDouble();
        System.out.println("Введите c");
        double c = in.nextDouble();

        if (a == b || b == c || a == c) {
            System.out.println("Есть одинаковые числа");
            System.exit(0);
        }

        if (( a>b & a<c) || ( a<b & a>c)) {
            System.out.println("Удвоенно число a, a = " + a*2);
        }
        if (( b>a & b<c) || ( b<a & b>c)) {
            System.out.println("Удвоенно число b, b = " + b*2);
        }
        if (( c>a & c<b) || ( c<a & c>b)) {
            System.out.println("Удвоенно число c, c = " + c*2);
        }
    }
}
