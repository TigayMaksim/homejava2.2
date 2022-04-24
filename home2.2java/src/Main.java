public class Main {
    public static void main(String[] args) {
        int account = 100;
        int incoming = 1000;
        int amount = account + incoming;

        int percent = 1;
        int bonus = amount * percent / 100;

        int eventually = amount + bonus;

        System.out.println("Итоговый счёт: " + eventually);
        System.out.println("Бонусных рублей: " + bonus);
    }
}
