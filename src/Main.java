
public class Main {
    public static void main(String[] args) {

        int balance = 200;
        int credit = 2100;

        int bonus;
        if (credit > 1000) {
            bonus = credit / 100;
        } else {
            bonus = 0;
        }

        int total = balance + credit + bonus;


        System.out.println(" Итоговый баланс: " + total);
        System.out.println(" Сумма бонусов: " + bonus);
    }
}
