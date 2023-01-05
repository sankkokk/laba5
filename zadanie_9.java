import java.util.Scanner;
import static java.lang.System.exit;

public class zadanie_9_laba5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько тебе лет?");
        int ans1 = sc.nextInt();
        if (sc.hasNextLine())
            switch (ans1) {
                case 18 -> System.out.println("Пенсия");
                case 17 -> System.out.println("В самом расцвете сил");
                case 16 -> {
                    System.out.println("Нам рано общаться");
                    exit(0);
                }

            }
        System.out.println("Откуда ты? 1 - Пермь, 2 - Москва, 3 - Питер");
        int ans2 = sc.nextInt();
        if (sc.hasNextLine())
            switch (ans2) {
                case 1 -> System.out.println("Легенда");
                case 3 -> System.out.println("Культурный");
                case 2 -> {
                    System.out.println("Понаехали тут");
                    exit(0);
                }
            }
        System.out.println("Где ты учишься? 1 - Школа, 2 - ВУЗ, 3 - Колледж, 4 - Работаю ");
        int ans3 = sc.nextInt();
        if (sc.hasNextLine())
            switch (ans3) {
                case 1 -> System.out.println("Отойди от компьютера");
                case 2 -> System.out.println("Легенда");
                case 3 -> System.out.println("Ну...");
                case 4 ->
                        System.out.println("Удачи с ипотекой");
            }

        System.out.println("Спасибо за уделенное время");
    }
}
