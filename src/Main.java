public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int topUp = 1100;
        int bonus = topUp / 100;
        {
            if (topUp <= 1000) {
                bonus = 0;
            }
        }
        int totalBalance = balance + topUp + bonus;

        System.out.println("Ваш бонус:" + bonus);
        System.out.println("Ваш баланс:" + totalBalance);
    }
}