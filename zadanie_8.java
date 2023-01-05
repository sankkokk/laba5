import java.util.Scanner;

public class zadanie_8_laba5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер планеты относительно удаленности от Солнца");
        String a = in.nextLine();
        switch (a){
            case "1" -> System.out.println("Меркурий. Спутники отсутствуют");
            case "2" -> System.out.println("Венера. Спутники отсутствуют ");
            case "3" -> System.out.println("Земля. 1 спутник: Луна");
            case "4" -> System.out.println("Марс. 2 спутника: Фобос, Деймос");
            case "5" -> System.out.println("Юпитер. 67 спутников. Самые крупные: Ио, Европа, Ганимед, Каллисто");
            case "6" -> System.out.println("Сатурн. 63 спутника. Самые крупные: Прометей, Пандора, Янус, Атлас");
            case "7" -> System.out.println("Уран. 27 спутников. Самые крупные: Миранда, Ариэль, Умбриель, Титания");
            case "8" -> System.out.println("Нептун. 12 спутников. Самые крупные: Протей, Наяда, Таласса, Деспина");
            case "9" -> System.out.println("Плутон. 5 спутников: Харон, Стикс, Никта, Кербер, Гидра ");
        }
    }
}
