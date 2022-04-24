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
    }
}
