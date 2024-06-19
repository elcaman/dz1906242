import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int phoneBill, amountOfDeposit, bonus, oneBonusRuble;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите начальный счет: ");
        phoneBill = input.nextInt();

        System.out.println("Введите сумму пополнения: ");
        amountOfDeposit = input.nextInt();

        oneBonusRuble = 100;

        if (amountOfDeposit > 1000) {
            bonus = amountOfDeposit / oneBonusRuble;
            phoneBill = phoneBill + amountOfDeposit + bonus;
            System.out.println("Ваш баланс на телефоне: " + phoneBill);
        } else {
            phoneBill = phoneBill + amountOfDeposit;
            System.out.println("Ваш баланс на телефоне: " + phoneBill);
        }
    }
}