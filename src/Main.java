public class Main {
    public static void main(String[] args) {
        int account = 100; // сумма на счету клиента
        int amount = 1100; // сумма пополнения
        int bonus = amount / 100; // рассчитываемый бонус

        int accountTotal;
        if (amount >= 1000) {
            accountTotal = account + amount + bonus;
        } else{
            accountTotal = account + amount;
        }

        System.out.println("Итоговая сумма на счёте клиента: " + accountTotal);

    }
}