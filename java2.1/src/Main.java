public class Main {
    public static void main(String[] args) {
        int amount = 6355;
        boolean isRegistered = true;

        int percent;
        if (isRegistered) {
            percent = 5;
        } else {
            percent = 0;
        }

        int bonus = amount * percent / 100;
        System.out.println("Миль: " + bonus);
        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли

        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
    }
}
