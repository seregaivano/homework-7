public class Main {
    public static void main(String[] args) {

        //Задача 1
        int postpone = 15_000;
        int total = 0;
        int month = 1;
        while (total < 2_459_000) {
            total = total + postpone;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        // Задача 2
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i);
        }
        System.out.println(" ");
        for (int j = 10; j > 0; j--) {
            System.out.print(" " + j);
        }
        System.out.println();

        //Задача 3
        int y = 12_000_000;
        int born = 17;
        int died = 8;
        for (int year = 1; year < 10; year++) {
            y += y * (born - died) / 1000;
            System.out.println("Год " + year + " численность населения состовляет " + y + " человек");
        }
        // Задача 4

        double money = 15000;
        int month1 = 0;
        double bankPercent = 0.07;
        int all = 12_000_000;
        while (money < all) {
            month1 = month1 + 1;
            money = money + money * bankPercent;
            System.out.println("Сумма " + money + " , количество месяцев " + month1);
        }

        // Задача 5
        double money1 = 15000;
        double bankPercent1 = 0.07;
        int all1 = 12_000_000;
        int period = 6;
        for (int month12 = 0; money1 < all1; month12++) {
            money1 = money1 + money1 * bankPercent1;
            if (month12 % period == 0) {
                System.out.println("Сумма накоплений " + money1 + " ,за количество месяцев " + month12);
            }
        }
        // Задача 6

        double money2 = 15000;
        int period2 = 6;
        int years = 9;
        int allMonth = years * 12;
        double bankPercent2 = 0.07;
        for (int month12 = 1; month12 <= allMonth; month12++) {
            money2 = money2 + money2 * bankPercent2;
            if (month12 % period2 == 0) {
                System.out.println("Сумма " + money2 + " , количество месяцев " + month12);
            }
        }
        // Задача 7
        for (int f = 1; f < 31; f += 7) {
            System.out.println("Сегодня пятница " + f + " необходимо подготовить отчет");
        }

        //Задача 8
        int currentYear = 2023;
        for (int iq = 0; iq < currentYear + 100; iq += 79) {
            if (iq > currentYear - 200) {
                System.out.println(iq);
            }
        }
    }
}